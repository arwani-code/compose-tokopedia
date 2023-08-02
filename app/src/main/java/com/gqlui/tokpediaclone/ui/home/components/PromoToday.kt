package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.MaxDivider

@Composable
fun PromoToday(
    modifier: Modifier = Modifier,
    data: List<RowHomeIc>
) {
    val context = LocalContext.current
    Column(modifier = modifier.fillMaxSize().background(Color.White)) {
        TitleSection(title = "Pilihan Promo Hari ini", paddingVertical = 0.dp)
        LazyRow(
            contentPadding = PaddingValues(horizontal = 10.dp),
            modifier = modifier.fillMaxSize()
        ) {
            items(data,  /* key = { item -> item.image } */) {
                Card(
                    shape = RoundedCornerShape(12.dp),
                    modifier = modifier
                        .padding(horizontal = 4.dp)
                        .height(250.dp)
                        .width(140.dp)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(context).data(it.image).build(),
                        contentDescription = "image",
                        contentScale = ContentScale.FillBounds,
                        modifier = modifier.fillMaxSize()
                    )
                }
            }
        }
        Spacer(modifier = modifier.height(10.dp))
        MaxDivider()
    }
}