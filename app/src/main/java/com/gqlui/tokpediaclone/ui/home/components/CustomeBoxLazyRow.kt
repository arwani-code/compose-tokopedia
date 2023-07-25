package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.gqlui.tokpediaclone.base.rememberClockVector
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.MaxDivider
import com.gqlui.tokpediaclone.ui.home.ImageColor
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor
import com.gqlui.tokpediaclone.ui.utils.imgUrl
import kotlinx.coroutines.delay

@Composable
fun BoxLazyRow(
    modifier: Modifier = Modifier,
    items: List<RowHomeIc>,
    imageBgUrl: ImageColor
) {
    val lazyListState = rememberLazyListState()
    var timeSecond by remember {
        mutableIntStateOf(60)
    }
    LaunchedEffect(key1 = timeSecond, block = {
        delay(1000)
        when (timeSecond) {
            0 -> timeSecond = 60
        }
        timeSecond--
    })
    Column(modifier = modifier.padding(vertical = 14.dp)) {
        Text(
            text = "Kejar Diskon Spesial",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp),
        )
        Row(
            modifier = modifier
                .height(50.dp)
                .fillMaxWidth()
                .padding(start = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {
                Text(text = "Berakhir dalam", fontSize = 12.sp)
                Spacer(modifier = modifier.width(8.dp))
                Box(
                    modifier = modifier
                        .padding(end = 10.dp)
                        .clip(CircleShape)
                        .height(20.dp)
                        .background(color = Color(0xFFE02954)),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = modifier,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(
                            imageVector = rememberClockVector(),
                            contentDescription = "",
                            tint = Color.White,
                            modifier = modifier.padding(horizontal = 6.dp)
                        )
                        Text(
                            text = buildAnnotatedString {
                                append("01")
                                append(" : ")
                                append("27")
                                append(" : ")
                                if (timeSecond < 10)
                                    append(" 0$timeSecond ")
                                else
                                    append(" $timeSecond ")
                            }, fontSize = 12.sp, color = Color.White, fontWeight = FontWeight.Bold,
                            modifier = modifier.padding(end = 6.dp)
                        )
                    }
                }
            }

            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Lihat Semua",
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor,
                    fontSize = 13.sp
                )
            }
        }
        CustomImageRow(
            lazyListState = lazyListState, items = items, imageBgUrl = imageBgUrl,
            cardWidth = 140.dp,
            cardHeight = 240.dp,
            sizeImage = 150.dp
        )
        Spacer(modifier = modifier.height(8.dp))
        MaxDivider()
    }
}

@Composable
fun CustomImageRow(
    modifier: Modifier = Modifier,
    lazyListState: LazyListState,
    items: List<RowHomeIc>,
    imageBgUrl: ImageColor,
    boxHeight: Dp = 270.dp,
    cardWidth: Dp,
    cardHeight: Dp,
    sizeImage: Dp
) {
    val colorList = listOf(
        Color(0xFF00D827),
        Color(0xFF05A801),
        Color(0xFFEC6A2A),
        Color(0xFF7D5335),
        Color(0xFFC29875),
    )
    Box(
        modifier = modifier
            .height(boxHeight)
            .fillMaxWidth()
            .background(
                imageBgUrl.color
            ),
    ) {
        Image(
            painter = rememberAsyncImagePainter(model = imageBgUrl.imageUrl.imgUrl()),
            contentDescription = "",
            modifier = modifier
                .fillMaxHeight()
                .width(140.dp)
                .graphicsLayer {
                    alpha =
                        if (lazyListState.firstVisibleItemScrollOffset < 500 && lazyListState.firstVisibleItemIndex == 0) 120f / lazyListState.firstVisibleItemScrollOffset else 0.5f
                    translationX =
                        if (lazyListState.firstVisibleItemScrollOffset < 100 && lazyListState.firstVisibleItemIndex == 0) 0f - lazyListState.firstVisibleItemScrollOffset else -100f
                },
            contentScale = ContentScale.FillWidth,
        )
        LazyRow(
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp), modifier = modifier,
            state = lazyListState,
        ) {
            item {
                Box(
                    modifier = modifier
                        .height(275.dp)
                        .width(140.dp)
                )
            }
            items(items, key = { it.image }) { data ->
                CardItemDiscount(
                    paddingEnd = 10.dp,
                    paddingTop = 12.dp,
                    data = data,
                    cardWidth = cardWidth,
                    cardHeight = cardHeight,
                    sizeImage = sizeImage,
                    colorList = colorList
                )
            }
        }
    }
}