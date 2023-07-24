package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.MaxDivider

@Composable
fun RowIconImage(
    rowIcs: List<RowHomeIc>,
    items: List<String>
) {
    LazyRow(contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp)) {
        items(rowIcs.slice(0..10), key = { it.image }) {
            RowIconItem(image = it.image, title = it.title)
        }
    }
    ImageHorizontalPager(items = items)
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
    ) {
        items(rowIcs.slice(11..18), key = { it.image }) {
            RowIconItem(image = it.image, title = it.title)
        }
    }
    MaxDivider()
}