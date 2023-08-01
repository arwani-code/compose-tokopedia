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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import com.gqlui.tokpediaclone.R
import com.gqlui.tokpediaclone.base.rememberVectorOfficialStore
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun CardItemDiscount(
    modifier: Modifier = Modifier,
    paddingTop: Dp = 0.dp,
    paddingEnd: Dp = 12.dp,
    paddingBottom: Dp = 0.dp,
    data: RowHomeIc,
    cardWidth: Dp,
    cardHeight: Dp,
    sizeImage: Dp,
    colorList: List<Color>
) {
    Card(
        modifier = modifier
            .padding(end = paddingEnd, top = paddingTop, bottom = paddingBottom)
            .width(cardWidth)
            .height(cardHeight),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = data.image),
                contentDescription = "",
                modifier = modifier
                    .fillMaxWidth()
                    .size(sizeImage),
                contentScale = ContentScale.FillBounds,
                alignment = Alignment.Center
            )
            if (data.textAltImage.isNotEmpty()) {
                Box(
                    modifier = modifier
                        .clip(RoundedCornerShape(bottomEnd = 16.dp))
                        .fillMaxWidth()
                        .height(20.dp)
                        .background(
                            colorList
                                .shuffled()
                                .first()
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = data.textAltImage,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
            }
            Column(
                modifier = modifier
                    .padding(start = 10.dp, top = 8.dp, end = 12.dp)
                    .fillMaxWidth(),
            ) {
                if (data.subTitle.isNotEmpty()) {
                    Text(
                        text = data.subTitle,
                        color = Color.Gray,
                        fontSize = 12.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        style = TextStyle(
                            lineHeight = 16.sp
                        )
                    )
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
                        horizontalArrangement = Arrangement.SpaceBetween
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
                                modifier = modifier.padding(3.dp)
                            )
                        }
                        Spacer(modifier = modifier.width(4.dp))
                        Text(
                            text = data.price,
                            color = Color.Gray,
                            textDecoration = TextDecoration.LineThrough,
                            fontSize = 11.sp
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
                if (data.city.isNotEmpty()) {
                    Row(
                        modifier = modifier,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            imageVector = rememberVectorOfficialStore(),
                            contentDescription = "",
                            modifier = modifier.size(18.dp)
                        )
                        Spacer(modifier = modifier.width(2.dp))
                        Text(
                            text = data.city, color = Color.Gray, fontSize = 12.sp,
                            letterSpacing = 0.sp
                        )
                    }
                }
                if (data.ratingStar.isNotEmpty()) {
                    Row(
                        modifier = modifier,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            imageVector = Icons.Rounded.Star,
                            contentDescription = "",
                            modifier = modifier
                                .size(18.dp)
                                .graphicsLayer {
                                    translationX = -2f
                                },
                            colorFilter = ColorFilter.tint(
                                color = Color(0xFFFFC400)
                            )
                        )
                        Spacer(modifier = modifier.width(2.dp))
                        Text(
                            text = data.ratingStar,
                            color = Color.Gray,
                            fontSize = 12.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            letterSpacing = 0.sp
                        )
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        AsyncImage(
                            model = "https://images.tokopedia.net/img/bo-reg-0k.png",
                            contentDescription = "",
                            modifier = modifier
                                .height(20.dp)
                                .graphicsLayer {
                                    translationX = -10f
                                }
                        )
                    }
                }
                if (data.arrived.isNotEmpty()) {
                    Text(
                        text = data.arrived,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = modifier.padding(vertical = 8.dp),
                        letterSpacing = 0.sp
                    )
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
            subTitle = "Lanjut browse",
        ),
        cardWidth = 140.dp,
        cardHeight = 240.dp,
        sizeImage = 150.dp,
        colorList = emptyList()
    )
}