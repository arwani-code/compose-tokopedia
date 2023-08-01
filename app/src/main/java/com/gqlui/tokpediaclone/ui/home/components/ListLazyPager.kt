package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.data.model.RowHomeIc


@Composable
fun ListLazyPager(
    modifier: Modifier = Modifier, icList: List<RowHomeIc>,
    colorList: List<Color>
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        modifier = modifier
            .height((icList.size * 70).dp)
            .background(Color.White),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalItemSpacing = 16.dp
    ) {
        itemsIndexed(icList) { index, data ->
            CardItemDiscount(
                cardWidth = 100.dp,
                cardHeight = if (index % 2 != 1) 335.dp else 360.dp,
                sizeImage = 130.dp,
                data = data,
                colorList = colorList,
                paddingBottom = 0.dp,
                paddingEnd = 0.dp,
                paddingTop = 0.dp
            )
        }
    }
}