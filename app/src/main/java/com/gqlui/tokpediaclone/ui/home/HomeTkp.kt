package com.gqlui.tokpediaclone.ui.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.TkpTopAppBar
import com.gqlui.tokpediaclone.ui.home.components.BoxLazyRow
import com.gqlui.tokpediaclone.ui.home.components.ContinueCheck
import com.gqlui.tokpediaclone.ui.home.components.FreeOngkir
import com.gqlui.tokpediaclone.ui.home.components.GridRowSchool
import com.gqlui.tokpediaclone.ui.home.components.InterestingPromo
import com.gqlui.tokpediaclone.ui.home.components.PromoRemainder
import com.gqlui.tokpediaclone.ui.home.components.PromoToday
import com.gqlui.tokpediaclone.ui.home.components.RowIconImage
import com.gqlui.tokpediaclone.ui.home.components.ShopInView
import com.gqlui.tokpediaclone.ui.home.components.ShoppingCategory
import com.gqlui.tokpediaclone.ui.home.components.StaggeredGridColumn
import com.gqlui.tokpediaclone.ui.home.components.TopRowBar
import com.gqlui.tokpediaclone.ui.home.components.VitaminAndSupplement
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor
import com.gqlui.tokpediaclone.ui.utils.CustomProgressIndicator
import com.gqlui.tokpediaclone.ui.utils.customTabIndicatorOffset
import com.gqlui.tokpediaclone.ui.utils.imgUrl
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(
    ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class,
    ExperimentalFoundationApi::class
)
@Composable
fun HomeTkp(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val systemUiController = rememberSystemUiController()
    val scrollState = rememberScrollState()
    var refreshing by remember { mutableStateOf(false) }
    var loading by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    val isScrollInProgress by remember {
        mutableStateOf(derivedStateOf {
            scrollState.value > 100
        })
    }.value

    val topBarColor by animateColorAsState(
        targetValue = if (isScrollInProgress) {
            Color.White
        } else {
            PrimaryColor
        }, label = ""
    )
    val rowIcs by viewModel.rowIcsState.collectAsStateWithLifecycle()
    val continueCheckState by viewModel.continueCheckState.collectAsStateWithLifecycle()
    val discountSpecial by viewModel.discountSpecial.collectAsStateWithLifecycle()
    val needsSchool by viewModel.needsSchool.collectAsStateWithLifecycle()
    val vitaminAndSupplements by viewModel.vitaminAndSupplements.collectAsStateWithLifecycle()
    val promoToday by viewModel.promoToday.collectAsStateWithLifecycle()
    val promoReminders by viewModel.promoReminders.collectAsStateWithLifecycle()
    val shoppingCategories by viewModel.shoppingCategories.collectAsStateWithLifecycle()

    DisposableEffect(key1 = Unit, effect = {
        onDispose {
            systemUiController.setStatusBarColor(Color.White)
        }
    })

    LaunchedEffect(key1 = isScrollInProgress, block = {
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

    val listTitle =
        listOf(
            "For Alexandra",
            "Spesial di WIB",
            "Back to School",
            "Special Discount",
            "Aktivitasmu",
            "Laptop",
            "Gadget",
            "Cleanser Waiah"
        )
    val pagerState = rememberPagerState(pageCount = { listTitle.size })

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
            val screenHeight = maxHeight
            Column(
                modifier = modifier
                    .padding(innerPadding)
                    .pullRefresh(pullRefreshState)
                    .fillMaxSize()
                    .background(PrimaryColor)
                    .verticalScroll(scrollState)
                    .graphicsLayer {
                        translationY = if (refreshing) 200f else 0f
                    }
            ) {
                TopRowBar()
                HomeContent(
                    rowIcs = rowIcs,
                    imageHorizontal = viewModel.imagesPager,
                    continueCheckState = continueCheckState,
                    discountSpecial = discountSpecial,
                    needsSchool = needsSchool,
                    vitaminAndSupplement = vitaminAndSupplements,
                    promoToday = promoToday,
                    loading = loading,
                    viewModel = viewModel,
                    promoReminders = promoReminders,
                    shoppingCategories = shoppingCategories
                )
                Column(modifier = modifier.height(screenHeight)) {
                    HomScrollableTabRow(
                        tabs = listTitle,
                        selectedTabIndex = pagerState.currentPage,
                        onTabClick = {})
                    HorizontalPager(
                        state = pagerState,
                        verticalAlignment = Alignment.Top,
                        modifier = modifier
                            .fillMaxHeight()
                            .nestedScroll(remember {
                                object : NestedScrollConnection {
                                    override fun onPreScroll(
                                        available: Offset,
                                        source: NestedScrollSource
                                    ): Offset {
                                        return if (available.y > 0) Offset.Zero else Offset(
                                            x = 0f,
                                            y = scrollState.dispatchRawDelta(-available.y)
                                        )
                                    }
                                }
                            })
                    ) { page ->
                        when (page) {
                            0 -> {
                                StaggeredGridColumn(
                                    data = promoReminders,
                                    index = page
                                )
                            }

                            1 -> {
                                StaggeredGridColumn(
                                    data = promoReminders,
                                    index = page
                                )
                            }

                            2 -> {
                                StaggeredGridColumn(
                                    data = promoReminders,
                                    index = page
                                )
                            }
                        }
                    }
                }
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

@Composable
private fun HomeContent(
    modifier: Modifier = Modifier,
    rowIcs: List<RowHomeIc>,
    imageHorizontal: List<String>,
    loading: Boolean = false,
    continueCheckState: List<RowHomeIc>,
    discountSpecial: List<RowHomeIc>,
    needsSchool: List<RowHomeIc>,
    vitaminAndSupplement: List<RowHomeIc>,
    promoToday: List<RowHomeIc>,
    promoReminders: List<RowHomeIc>,
    viewModel: HomeViewModel,
    shoppingCategories: List<RowHomeIc>
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            .fillMaxSize()
            .background(Color.White)
    ) {
        RowIconImage(rowIcs = rowIcs, items = imageHorizontal)
        ContinueCheck(continueCheckState = continueCheckState)
        BoxLazyRow(items = discountSpecial, imageBgUrl = viewModel.bgImageSpecialDiscount)
        FreeOngkir(freeOngkirs = promoReminders)
        GridRowSchool(needsSchool = needsSchool)
        VitaminAndSupplement(vitaminAndSupplements = vitaminAndSupplement)
        PromoToday(data = promoToday)
        PromoRemainder(promoReminders = promoReminders, viewModel = viewModel)
        ShopInView(data = promoReminders)
        InterestingPromo(data = promoReminders, viewModel = viewModel)
        ShoppingCategory(data = shoppingCategories)
    }
}

@Composable
private fun HomScrollableTabRow(
    modifier: Modifier = Modifier,
    tabs: List<String>,
    selectedTabIndex: Int,
    onTabClick: (Int) -> Unit
) {
    val density = LocalDensity.current
    val tabWidths = remember {
        val tabWidthStateList = mutableStateListOf<Dp>()
        repeat(tabs.size) {
            tabWidthStateList.add(0.dp)
        }
        tabWidthStateList
    }
    ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        edgePadding = 8.dp,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier
                    .customTabIndicatorOffset(
                        currentTabPosition = tabPositions[selectedTabIndex],
                        tabWidth = 30.dp,
                    )
                    .graphicsLayer {
                        translationY = 20f
                        translationX = -75f
                    },
                color = Color.White
            )
        },
    ) {
        tabs.forEachIndexed { tabIndex, tab ->
            Card(
                shape = RoundedCornerShape(10.dp),
                modifier = modifier
                    .padding(horizontal = 1.dp)
                    .height(60.dp)
                    .width(110.dp),
            ) {
                Tab(
                    selected = selectedTabIndex == tabIndex,
                    onClick = { onTabClick(tabIndex) },
                    text = {
                        Text(
                            text = tab,
                            onTextLayout = { textLayoutResult ->
                                tabWidths[tabIndex] =
                                    with(density) { textLayoutResult.size.width.toDp() }
                            },
                            fontWeight = FontWeight.Bold,
                            lineHeight = 14.sp,
                            textAlign = TextAlign.Start,

                            )
                    },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White,
                    modifier = modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    Color(0xFF9F206E),
                                    Color(0xFFAC2077),
                                    Color(0xFFB3207E),
                                    Color(0xFFBC2183),
                                )
                            )
                        )
                )
            }
        }
    }
}


