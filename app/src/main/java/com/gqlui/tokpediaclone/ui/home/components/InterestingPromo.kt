package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.home.HomeViewModel

@Composable
fun InterestingPromo(
    modifier: Modifier = Modifier,
    data: List<RowHomeIc>,
    viewModel: HomeViewModel
) {
    val lazyListState = rememberLazyListState()
    Column {
        TitleSection(title = "Promo Menarik")
        CustomImageRow(
            lazyListState = lazyListState,
            items = data.shuffled(),
            imageBgUrl = viewModel.bgImageInterestingPromo,
            boxHeight = 370.dp,
            cardWidth = 135.dp,
            cardHeight = 335.dp,
            sizeImage = 130.dp
        )
    }
}