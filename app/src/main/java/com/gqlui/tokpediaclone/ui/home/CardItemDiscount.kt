package com.gqlui.tokpediaclone.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CardItemDiscount(
    modifier: Modifier = Modifier,
    imageUrl: String,
    title: String,
    subTitle: String,
    paddingTop: Dp = 0.dp,
    paddingEnd: Dp = 12.dp
) {
    Card(
        modifier = modifier
            .padding(end = paddingEnd, top = paddingTop)
            .width(150.dp)
            .height(250.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = imageUrl),
                contentDescription = "",
                modifier = modifier
                    .fillMaxWidth()
                    .size(150.dp),
                contentScale = ContentScale.FillBounds,
                alignment = Alignment.Center
            )
            Column(
                modifier = modifier
                    .padding(start = 10.dp, top = 8.dp, end = 12.dp)
                    .fillMaxWidth(),
            ) {
                Text(text = subTitle, color = Color.Gray, fontSize = 12.sp)
                Spacer(modifier = modifier.height(8.dp))
                Text(text = title, fontWeight = FontWeight.Bold, fontSize = 14.sp)
            }
        }
    }
}


@Preview
@Composable
fun ItemDiscountPreview() {
    CardItemDiscount(
        imageUrl = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2022/3/21/b13e9abf-e969-430d-ae33-5422a86608bf.jpg.webp?ect=4g",
        title = "Soft Case Handphone",
        subTitle = "Lanjut browse"
    )
}