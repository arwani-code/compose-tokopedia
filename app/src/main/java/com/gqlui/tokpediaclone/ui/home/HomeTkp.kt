@file:OptIn(ExperimentalFoundationApi::class)

package com.gqlui.tokpediaclone.ui.home

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.MaxDivider
import com.gqlui.tokpediaclone.ui.components.TkpTopAppBar
import com.gqlui.tokpediaclone.ui.home.components.BoxLazyRow
import com.gqlui.tokpediaclone.ui.home.components.ContinueCheck
import com.gqlui.tokpediaclone.ui.home.components.GridRowSchool
import com.gqlui.tokpediaclone.ui.home.components.RowIconImage
import com.gqlui.tokpediaclone.ui.home.components.TopRowBar
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTkp(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val systemUiController = rememberSystemUiController()
    val rowIcs by viewModel.rowIcsState.collectAsStateWithLifecycle()
    val continueCheckState by viewModel.continueCheckState.collectAsStateWithLifecycle()
    val discountSpecial by viewModel.discountSpecial.collectAsStateWithLifecycle()
    val needsSchool by viewModel.needsSchool.collectAsStateWithLifecycle()

    DisposableEffect(key1 = systemUiController, effect = {
        systemUiController.setStatusBarColor(PrimaryColor)
        onDispose { }
    })

    Scaffold(
        topBar = {
            TkpTopAppBar()
        },
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .background(PrimaryColor)
                .verticalScroll(rememberScrollState())
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


