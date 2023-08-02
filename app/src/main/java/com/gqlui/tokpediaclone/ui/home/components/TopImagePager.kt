package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor
import kotlin.math.absoluteValue

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageHorizontalPager(
    modifier: Modifier = Modifier,
    items: List<String>,
    spacing: Dp = 10.dp,
) {
    Column(modifier = modifier) {
        val pageCount = Int.MAX_VALUE / 2
        val pagerState = rememberPagerState(pageCount = { pageCount })
        val context = LocalContext.current
        HorizontalPager(
            beyondBoundsPageCount = items.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) { index ->
            Card(
                modifier = modifier
                    .padding(horizontal = 4.dp)
                    .height(120.dp)
                    .graphicsLayer {
                        val pageOffset = (
                                (pagerState.currentPage - index) + pagerState
                                    .currentPageOffsetFraction
                                ).absoluteValue
                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    },
                shape = RoundedCornerShape(12.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(context).data(items[index % items.size]).build(),
                    contentDescription = "image",
                    contentScale = ContentScale.FillBounds,
                    modifier = modifier.fillMaxSize()
                )
            }
        }

        Box(
            modifier = modifier
                .height(40.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(items.size) { iteration ->
                    val color =
                        if (pagerState.currentPage % items.size == iteration) PrimaryColor else Color.LightGray
                    Box(
                        modifier = Modifier
                            .padding(vertical = 6.dp, horizontal = 2.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(6.dp),
                    )
                }
            }
        }
    }
}