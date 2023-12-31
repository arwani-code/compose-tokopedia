package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun StaggeredGridColumn(
    modifier: Modifier = Modifier,
    data: List<RowHomeIc>,
    index: Int,
) {
    val colorList = listOf(
        Color(0xFF00D827),
        Color(0xFF05A801),
        Color(0xFFEC6A2A),
        Color(0xFF7D5335),
        Color(0xFFC29875),
    )
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2)
    ) {
        items(data) {
            CardItemDiscount(
                cardWidth = 135.dp,
                cardHeight = 330.dp,
                sizeImage = 130.dp, data = it,
                colorList = colorList
            )
        }
    }
}