package com.gqlui.tokpediaclone.ui.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
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
import com.gqlui.tokpediaclone.ui.home.components.TopRowBar
import com.gqlui.tokpediaclone.ui.home.components.VitaminAndSupplement
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor
import com.gqlui.tokpediaclone.ui.utils.CustomProgressIndicator
import com.gqlui.tokpediaclone.ui.utils.imgUrl
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
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
        }
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
fun HomeContent(
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


