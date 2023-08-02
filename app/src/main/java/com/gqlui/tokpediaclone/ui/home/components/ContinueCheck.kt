package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun ContinueCheck(
    modifier: Modifier = Modifier,
    continueCheckState: List<RowHomeIc>,
) {
    val scrollState = rememberLazyListState()
    val colorList = listOf(
        Color(0xFF00D827),
        Color(0xFF05A801),
        Color(0xFFEC6A2A),
        Color(0xFF7D5335),
        Color(0xFFC29875),
    )
    Box(modifier = modifier
        .fillMaxWidth()
        .background(Color.White)) {
        Column(modifier = modifier.padding(vertical = 8.dp)) {
            TitleSection(title = "Lanjut cek ini, yuk", canShowTextButton = false, paddingVertical = 10.dp)
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                state = scrollState,
            ) {
                items(continueCheckState /* key = { item -> item.image } */) {
                    CardItemDiscount(
                        data = it,
                        cardWidth = 140.dp,
                        cardHeight = 240.dp,
                        sizeImage = 150.dp,
                        colorList = colorList
                    )
                }
            }
        }
    }
}