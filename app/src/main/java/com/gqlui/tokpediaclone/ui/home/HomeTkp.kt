package com.gqlui.tokpediaclone.ui.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.TkpTopAppBar
import com.gqlui.tokpediaclone.ui.home.components.BoxLazyRow
import com.gqlui.tokpediaclone.ui.home.components.CardItemDiscount
import com.gqlui.tokpediaclone.ui.home.components.ContinueCheck
import com.gqlui.tokpediaclone.ui.home.components.FreeOngkir
import com.gqlui.tokpediaclone.ui.home.components.GridRowSchool
import com.gqlui.tokpediaclone.ui.home.components.HomScrollableTabRow
import com.gqlui.tokpediaclone.ui.home.components.InterestingPromo
import com.gqlui.tokpediaclone.ui.home.components.ListLazyPager
import com.gqlui.tokpediaclone.ui.home.components.PromoRemainder
import com.gqlui.tokpediaclone.ui.home.components.PromoToday
import com.gqlui.tokpediaclone.ui.home.components.RowIconImage
import com.gqlui.tokpediaclone.ui.home.components.ShopInView
import com.gqlui.tokpediaclone.ui.home.components.ShoppingCategory
import com.gqlui.tokpediaclone.ui.home.components.TopRowBar
import com.gqlui.tokpediaclone.ui.home.components.VitaminAndSupplement
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(
    ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class
)
@Composable
fun HomeTkp(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val systemUiController = rememberSystemUiController()
    val scrollState = rememberLazyListState()
    var refreshing by remember { mutableStateOf(false) }
    var loading by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    val isScrollInProgress by remember {
        mutableStateOf(derivedStateOf {
            scrollState.firstVisibleItemScrollOffset > 100 || scrollState.firstVisibleItemIndex > 0
        })
    }.value

    val topBarColor by animateColorAsState(
        targetValue = if (isScrollInProgress) {
            Color.White
        } else {
            PrimaryColor
        }, label = ""
    )

    DisposableEffect(key1 = Unit, effect = {
        onDispose {
            systemUiController.setStatusBarColor(Color.White)
        }
    })

    LaunchedEffect(
        key1 = isScrollInProgress,
        block = {
            if (isScrollInProgress) {
                systemUiController.setStatusBarColor(Color.White)
            } else {
                systemUiController.setStatusBarColor(PrimaryColor)
            }
        })

    val pullRefreshState = rememberPullRefreshState(
        refreshing = refreshing,
        onRefresh = {
            scope.launch {
                refreshing = true
                delay(1200)
                refreshing = false
                delay(500)
                loading = true
                delay(3000)
                loading = false
                viewModel.refreshDataState()
            }
        })

    Scaffold(
        topBar = {
            TkpTopAppBar(
                bgColor = topBarColor,
                tinColor = if (isScrollInProgress) Color.Black.copy(alpha = 0.6f) else Color.White,
                isScrollInProgress = isScrollInProgress
            )
        },
    ) { innerPadding ->
        BoxWithConstraints(
            modifier = modifier.fillMaxSize(),
        ) {
            val maxHeight = maxHeight
            Column(
                modifier = modifier
                    .padding(innerPadding)
                    .pullRefresh(pullRefreshState)
                    .fillMaxSize()
                    .background(PrimaryColor)
                    .graphicsLayer {
                        translationY = if (refreshing) 200f else 0f
                    }
            ) {
                HomeContent(
                    loading = loading,
                    viewModel = viewModel,
                    scrollState = scrollState
                )
            }
            PullRefreshIndicator(
                refreshing = refreshing,
                state = pullRefreshState,
                modifier = modifier
                    .padding(top = 40.dp)
                    .align(
                        Alignment.TopCenter
                    ),
                contentColor = PrimaryColor,
                scale = true
            )
        }
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HomeContent(
    modifier: Modifier = Modifier,
    loading: Boolean = false,
    viewModel: HomeViewModel,
    scrollState: LazyListState
) {
    val rowIcs by viewModel.rowIcsState.collectAsStateWithLifecycle()
    val continueCheckState by viewModel.continueCheckState.collectAsStateWithLifecycle()
    val discountSpecial by viewModel.discountSpecial.collectAsStateWithLifecycle()
    val needsSchool by viewModel.needsSchool.collectAsStateWithLifecycle()
    val vitaminAndSupplements by viewModel.vitaminAndSupplements.collectAsStateWithLifecycle()
    val promoToday by viewModel.promoToday.collectAsStateWithLifecycle()
    val promoReminders by viewModel.promoReminders.collectAsStateWithLifecycle()
    val shoppingCategories by viewModel.shoppingCategories.collectAsStateWithLifecycle()

    val pagerState = rememberPagerState(pageCount = { viewModel.listTitle.size })

    LazyColumn(
        modifier = modifier
            .nestedScroll(object : NestedScrollConnection {
                override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                    return if (available.y > 0) Offset.Zero else Offset(
                        x = 0f,
                        y = -scrollState.dispatchRawDelta(-available.y)
                    )
                }
            })
            .fillMaxSize()
            .background(PrimaryColor),
        state = scrollState
    ) {
        item {
            TopRowBar()
        }
        item {
            RowIconImage(rowIcs = rowIcs, items = viewModel.imagesPager)
        }
        item {
            ContinueCheck(continueCheckState = continueCheckState)
        }
        item {
            BoxLazyRow(items = discountSpecial, imageBgUrl = viewModel.bgImageSpecialDiscount)
        }
        item {
            FreeOngkir(freeOngkirs = promoReminders)
        }
        item {
            GridRowSchool(needsSchool = needsSchool)
        }
        item {
            VitaminAndSupplement(vitaminAndSupplements = vitaminAndSupplements)
        }
        item {
            PromoToday(data = promoToday)
        }
        item {
            PromoRemainder(promoReminders = promoReminders, viewModel = viewModel)
        }
        item {
            ShopInView(data = promoReminders)
        }
        item {
            InterestingPromo(data = promoReminders, viewModel = viewModel)
        }
        item {
            ShoppingCategory(data = shoppingCategories)
        }
        stickyHeader {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                HomScrollableTabRow(
                    tabs = viewModel.listTitle,
                    onTabClick = {},
                    selectedTabIndex = pagerState.currentPage,
                    tabsHeight = 60.dp
                )
            }
        }
        item {
            HorizontalPager(
                state = pagerState,
            ) { page: Int ->
                when (page) {
                    0 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )

                    1 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )

                    2 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )

                    3 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )

                    4 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )

                    5 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )

                    6 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )

                    7 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )

                    8 -> ListLazyPager(
                        icList = promoReminders.shuffled(),
                        colorList = viewModel.colorList
                    )
                }
            }
        }
    }
}



