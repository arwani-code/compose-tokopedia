package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun ShoppingCategory(
    modifier: Modifier = Modifier,
    data: List<RowHomeIc>,
) {
    val scrollState = rememberLazyGridState()
    Column {
        TitleSection(title = "Kategori inspirasi belanjamu")
        LazyHorizontalGrid(
            rows = GridCells.Fixed(2),
            modifier = modifier
                .height(
                    350.dp
                )
                .nestedScroll(remember {
                    object : NestedScrollConnection {
                        override fun onPreScroll(
                            available: Offset,
                            source: NestedScrollSource
                        ): Offset {
                            return if (available.y > 0) Offset.Zero else Offset(
                                x = 0f,
                                y = -scrollState.dispatchRawDelta(-available.y)
                            )
                        }
                    }
                }),
            state = scrollState,
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(data, key = { it.image }) {
                CardItemDiscount(
                    data = it,
                    cardWidth = 120.dp,
                    cardHeight = 120.dp,
                    sizeImage = 100.dp,
                    colorList = emptyList(),
                )
            }
        }
    }
}