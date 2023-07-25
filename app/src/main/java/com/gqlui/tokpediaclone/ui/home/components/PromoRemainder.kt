package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Column {
        TitleSection(title = "Jangan lewatkan promonya")
        CustomImageRow(
            lazyListState = lazyListState,
            items = promoReminders,
            imageBgUrl = viewModel.bgImagePromoReminders,
            boxHeight = 350.dp,
            cardWidth = 135.dp,
            cardHeight = 330.dp,
            sizeImage = 130.dp
        )
    }
}