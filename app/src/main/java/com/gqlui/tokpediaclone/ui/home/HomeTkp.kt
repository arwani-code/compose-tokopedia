package com.gqlui.tokpediaclone.ui.home

import android.os.Build.VERSION.SDK_INT
import android.util.Log
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.gqlui.tokpediaclone.ui.components.TkpTopAppBar
import com.gqlui.tokpediaclone.ui.home.components.BoxLazyRow
import com.gqlui.tokpediaclone.ui.home.components.ContinueCheck
import com.gqlui.tokpediaclone.ui.home.components.FreeOngkir
import com.gqlui.tokpediaclone.ui.home.components.GridRowSchool
import com.gqlui.tokpediaclone.ui.home.components.HomeScrollableTabRow
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
import kotlin.math.roundToInt

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

    fun onRefresh() = scope.launch {
        refreshing = true
        delay(1200)
        refreshing = false
        delay(500)
        loading = true
        delay(3000)
        loading = false
        viewModel.refreshDataState()
    }

    val pullRefreshState = rememberPullRefreshState(
        refreshing = refreshing,
        onRefresh = ::onRefresh
    )

    Scaffold(
        topBar = {
            TkpTopAppBar(
                bgColor = topBarColor,
                tinColor = if (isScrollInProgress) Color.Black.copy(alpha = 0.6f) else Color.White,
                isScrollInProgress = isScrollInProgress
            )
        },
    ) { innerPadding ->
        Box(
            modifier = modifier.fillMaxSize(),
        ) {
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
            DragImageBox(innerPadding = innerPadding)
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
    val scope = rememberCoroutineScope()

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
            PromoRemainder(
                promoReminders = promoReminders,
                imgColor = viewModel.bgImagePromoReminders
            )
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
        item {
            PromoRemainder(
                promoReminders = promoReminders,
                imgColor = viewModel.bgImagePromoReminders2
            )
        }
        stickyHeader {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                HomeScrollableTabRow(
                    tabs = viewModel.listTitle,
                    onTabClick = { index ->
                        scope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    },
                    selectedTabIndex = pagerState.currentPage,
                    tabsHeight = 60.dp,
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
                        colorList = viewModel.colorList,
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

@Composable
fun DragImageBox(
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues
) {
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            add(ImageDecoderDecoder.Factory())
        }
        .build()
    var isHide by remember {
        mutableStateOf(false)
    }
    val size = Size()
    val screenHeight = size.height()
    val screenWidth = size.width() * 2.2
    var offsetX by remember { mutableFloatStateOf(screenWidth.toFloat()) }
    var offsetY by remember { mutableFloatStateOf(screenHeight.toFloat()) }

    LaunchedEffect(key1 = isHide, key2 = offsetX, key3 = offsetY, block = {
        Log.i("SKDMNKDMK", "offsetX: ${offsetX.toInt()}")
        when {
            isHide -> offsetX = (screenWidth * 2.5).toFloat()
//            else -> offsetX = (screenWidth * 2.1).toFloat()
        }
    })

    Box(
        modifier = Modifier
            .padding(innerPadding)
            .size(100.dp)
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
                .pointerInput(Unit) {
                    detectDragGestures { change, dragAmount ->
                        change.consume()
                        offsetX += dragAmount.x
                        offsetY += dragAmount.y
                    }
                },
            contentAlignment = Alignment.CenterStart
        ) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data("https://images.tokopedia.net/img/floating-80KB.gif.gif?ect=4g").build(),
                contentDescription = "image",
                contentScale = ContentScale.FillBounds,
                modifier = modifier.fillMaxSize(),
                imageLoader = imageLoader
            )
            Box(
                modifier = modifier
                    .size(30.dp)
                    .clip(CircleShape)
                    .background(PrimaryColor),
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = { isHide = !isHide }) {
                    Icon(
                        imageVector = if (isHide) Icons.Rounded.KeyboardArrowLeft else Icons.Rounded.KeyboardArrowRight,
                        contentDescription = "",
                        tint = Color.White,
                    )
                }
            }
        }
    }
}

