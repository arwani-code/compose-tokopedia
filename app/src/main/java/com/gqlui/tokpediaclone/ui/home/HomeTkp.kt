package com.gqlui.tokpediaclone.ui.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.TkpTopAppBar
import com.gqlui.tokpediaclone.ui.home.components.BoxLazyRow
import com.gqlui.tokpediaclone.ui.home.components.ContinueCheck
import com.gqlui.tokpediaclone.ui.home.components.GridRowSchool
import com.gqlui.tokpediaclone.ui.home.components.RowIconImage
import com.gqlui.tokpediaclone.ui.home.components.TopRowBar
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor
import kotlinx.coroutines.FlowPreview

enum class Screen {
    HOME, DETAIL, FEED
}

@OptIn(ExperimentalMaterial3Api::class, FlowPreview::class)
@Composable
fun HomeTkp(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val systemUiController = rememberSystemUiController()
    val scrollState = rememberScrollState()
    val topColorList = listOf(
        Color(0xFF16AE67),
        Color(0xFF89ecb9),
        Color(0xFF89ecb9),
        Color(0xFFccfcdc),
        Color(0xFFecfcf3),
        Color(0xFFFFFFFF)
    )

    var isScrollInProgress by remember {
        mutableStateOf(false)
    }

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

    DisposableEffect(key1 = Unit, effect = {
        systemUiController.setStatusBarColor(PrimaryColor)
        onDispose {
            systemUiController.setStatusBarColor(Color.White)
        }
    })

    LaunchedEffect(key1 = scrollState.value, block = {
        if (scrollState.value > 100) {
            isScrollInProgress = true
            systemUiController.setStatusBarColor(Color.White)
        } else {
            isScrollInProgress = false
            systemUiController.setStatusBarColor(PrimaryColor)
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
        Column(
            modifier = modifier
                .padding(innerPadding)
                .background(PrimaryColor)
                .verticalScroll(scrollState)
        ) {
            TopRowBar()
            HomeContent(
                rowIcs = rowIcs,
                imageHorizontal = viewModel.imagesPager,
                continueCheckState = continueCheckState,
                discountSpecial = discountSpecial,
                needsSchool = needsSchool
            )
        }
    }

}


@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    rowIcs: List<RowHomeIc>,
    imageHorizontal: List<String>,
    isLoading: Boolean = false,
    continueCheckState: List<RowHomeIc>,
    discountSpecial: List<RowHomeIc>,
    needsSchool: List<RowHomeIc>,
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            .fillMaxSize()
            .background(Color.White)
    ) {
        RowIconImage(rowIcs = rowIcs, items = imageHorizontal)
        ContinueCheck(continueCheckState = continueCheckState)
        BoxLazyRow(items = discountSpecial)
        GridRowSchool(needsSchool = needsSchool)
    }
}


