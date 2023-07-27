package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun ShopInView(
    modifier: Modifier = Modifier, data: List<RowHomeIc>,
    boxHeight: Dp = 370.dp,
    cardWidth: Dp = 135.dp,
    cardHeight: Dp = 335.dp,
    sizeImage: Dp = 130.dp
) {
    val colorList = listOf(
        Color(0xFF00D827),
        Color(0xFF05A801),
        Color(0xFFEC6A2A),
        Color(0xFF7D5335),
        Color(0xFFC29875),
    )
    Column(modifier = modifier.fillMaxWidth()) {
        TitleSection(title = "Dari toko yang dilihat")
        LazyRow(contentPadding = PaddingValues(horizontal = 12.dp)) {
            items(data /* key = {it.image}*/) {
                CardItemDiscount(
                    paddingEnd = 10.dp,
                    paddingTop = 12.dp,
                    data = it,
                    cardWidth = cardWidth,
                    cardHeight = cardHeight,
                    sizeImage = sizeImage,
                    paddingBottom = 12.dp,
                    colorList = colorList
                )
            }
        }
    }
}