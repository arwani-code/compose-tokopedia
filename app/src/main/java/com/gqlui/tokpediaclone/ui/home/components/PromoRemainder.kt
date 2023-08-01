package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.home.HomeViewModel
import com.gqlui.tokpediaclone.ui.utils.imgUrl

@Composable
fun PromoRemainder(
    modifier: Modifier = Modifier,
    promoReminders: List<RowHomeIc>,
    viewModel: HomeViewModel
) {
    val lazyListState = rememberLazyListState()
    Column(modifier = modifier.background(Color.White)) {
        TitleSection(title = "Jangan lewatkan promonya")
        CustomImageRow(
            lazyListState = lazyListState,
            items = promoReminders.shuffled(),
            imageBgUrl = viewModel.bgImagePromoReminders,
            boxHeight = 370.dp,
            cardWidth = 135.dp,
            cardHeight = 335.dp,
            sizeImage = 130.dp
        )
    }
}