package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.gqlui.tokpediaclone.base.rememberVectorCart
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun CardItemDiscount(
    modifier: Modifier = Modifier,
    paddingTop: Dp = 0.dp,
    paddingEnd: Dp = 12.dp,
    data: RowHomeIc = RowHomeIc()
) {
    Card(
        modifier = modifier
            .padding(end = paddingEnd, top = paddingTop)
            .width(140.dp)
            .height(240.dp),
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
                painter = rememberAsyncImagePainter(model = data.image),
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
                if (data.subTitle.isNotEmpty()) {
                    Text(text = data.subTitle, color = Color.Gray, fontSize = 12.sp)
                    Spacer(modifier = modifier.height(8.dp))
                }
                if (data.title.isNotEmpty()) Text(
                    text = data.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
                if (data.price.isNotEmpty() && data.discount.isNotEmpty()) {
                    Row(
                        modifier = modifier.padding(top = 6.dp, bottom = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = modifier
                                .clip(RoundedCornerShape(4.dp))
                                .background(color = Color(0xFFfcdbe3)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = data.discount,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFfc5c70),
                                fontSize = 12.sp,
                                modifier = modifier.padding(4.dp)
                            )
                        }
                        Spacer(modifier = modifier.width(4.dp))
                        Text(
                            text = data.price,
                            color = Color.Gray,
                            textDecoration = TextDecoration.LineThrough,
                            fontSize = 12.sp
                        )
                    }
                }
                if (data.progressIndicator.isNotEmpty()) {
                    Column(
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.Start
                    ) {
                        LinearProgressIndicator(
                            progress = data.progressIndicator.toFloat() / 100,
                            modifier = modifier
                                .clip(CircleShape)
                                .fillMaxWidth(),
                            color = Color(0xFFfc5c70),
                        )
                        Spacer(modifier = modifier.height(4.dp))
                        Text(
                            text = "Segera Habis",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFfc5c70)
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun ItemDiscountPreview() {
    CardItemDiscount(
        data = RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2022/3/21/b13e9abf-e969-430d-ae33-5422a86608bf.jpg.webp?ect=4g",
            title = "Soft Case Handphone",
            subTitle = "Lanjut browse"
        )
    )
}