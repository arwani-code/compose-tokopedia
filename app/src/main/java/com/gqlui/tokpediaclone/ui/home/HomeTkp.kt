@file:OptIn(ExperimentalFoundationApi::class)

package com.gqlui.tokpediaclone.ui.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.gqlui.tokpediaclone.base.rememberVectorLocation
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.TkpTopAppBar
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor
import kotlin.math.absoluteValue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTkp(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val systemUiController = rememberSystemUiController()
    val rowIcs by viewModel.rowIcsState.collectAsStateWithLifecycle()
    val continueCheckState by viewModel.continueCheckState.collectAsStateWithLifecycle()

    DisposableEffect(key1 = systemUiController, effect = {
        systemUiController.setStatusBarColor(PrimaryColor)
        onDispose { }
    })

    Scaffold(
        topBar = {
            TkpTopAppBar()
        },
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .background(PrimaryColor)
                .verticalScroll(rememberScrollState())
        ) {
            TopRowBar()
            HomeContent(
                rowIcs = rowIcs,
                imageHorizontal = viewModel.imagesPager,
                continueCheckState = continueCheckState
            )
        }
    }

}


@Composable
fun TopRowBar(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .height(130.dp)
    ) {
        Box(
            modifier = modifier
                .padding(horizontal = 12.dp)
                .fillMaxWidth()
                .height(20.dp), contentAlignment = Alignment.CenterStart
        ) {
            Row(modifier = modifier, horizontalArrangement = Arrangement.Center) {
                Icon(
                    imageVector = rememberVectorLocation(),
                    contentDescription = "",
                    modifier = modifier.size(15.dp),
                    tint = Color.White
                )
                Spacer(modifier = modifier.width(4.dp))
                Text(text = buildAnnotatedString {
                    append("Dikirim ke")
                    append(" ")
                    append(
                        AnnotatedString(
                            text = "Chinatown, New York City",
                            spanStyle = SpanStyle(
                                fontWeight = FontWeight.Bold
                            )
                        )
                    )
                }, color = Color.White, fontSize = 12.sp)
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
        Card(
            modifier = modifier
                .clip(CircleShape)
                .padding(horizontal = 12.dp, vertical = 10.dp)
                .fillMaxWidth()
                .height(80.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Row(
                modifier = modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = rememberAsyncImagePainter(model = "https://images.tokopedia.net/img/toppay/gopay-120x120.png"),
                            contentDescription = "",
                            modifier = modifier.size(20.dp)
                        )
                        Spacer(modifier = modifier.width(4.dp))
                        Text(text = "GoPay", fontSize = 12.sp)
                    }
                    Text(
                        text = "Rp10.000",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                        style = TextStyle(
                            letterSpacing = 0.sp
                        )
                    )
                    Text(
                        text = "0 Coins", fontSize = 12.sp, color = Color.Gray,
                        style = TextStyle(
                            letterSpacing = 0.sp
                        )
                    )
                }
                Column {
                    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = rememberAsyncImagePainter(model = "https://images.tokopedia.net/img/HThbdi/2023/03/17/rewards_silver_filled.png"),
                            contentDescription = "",
                            modifier = modifier.size(20.dp)
                        )
                        Spacer(modifier = modifier.width(4.dp))
                        Text(text = "Silver", fontSize = 12.sp)
                    }
                    Text(
                        text = "Silver",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                        style = TextStyle(
                            letterSpacing = 0.sp
                        )
                    )
                    Text(
                        text = "0 Kupon Baru", fontSize = 12.sp, color = Color.Gray,
                        style = TextStyle(
                            letterSpacing = 0.sp
                        )
                    )
                }
                Column {
                    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = rememberAsyncImagePainter(model = "https://images.tokopedia.net/img/plus/homepage/balancewidget/march2023/plus.png"),
                            contentDescription = "",
                            modifier = modifier.size(20.dp)
                        )
                        Spacer(modifier = modifier.width(4.dp))
                        Text(text = "pluS", fontSize = 12.sp)
                    }
                    Text(
                        text = "Coba 1 Bulan",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        style = TextStyle(
                            letterSpacing = 0.sp
                        )
                    )
                    Text(
                        text = "Langganan, Yuk!",
                        fontSize = 12.sp,
                        color = PrimaryColor,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(
                            letterSpacing = 0.sp
                        )
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    rowIcs: List<RowHomeIc>,
    imageHorizontal: List<String>,
    isLoading: Boolean = false,
    continueCheckState: List<RowHomeIc>
) {
    val lazyListState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    Column(
        modifier = modifier
            .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            .fillMaxSize()
            .background(Color.White)
    ) {
        LazyRow(contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp)) {
            items(rowIcs, key = { it.image }) {
                RowIconItem(image = it.image, title = it.title)
            }
        }
        ImageHorizontalPager(items = imageHorizontal)
        LazyRow(contentPadding = PaddingValues(horizontal = 16.dp)) {
            items(rowIcs, key = { it.image }) {
                RowIconItem(image = it.image, title = it.title)
            }
        }
        Divider(color = Color.LightGray.copy(alpha = 0.3f), modifier = modifier.height(10.dp))
        Text(
            text = "Lanjut cek ini, yuk",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(vertical = 10.dp, horizontal = 16.dp),
            fontSize = 16.sp
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(continueCheckState, key = { it.image }) {
                CardItemDiscount(imageUrl = it.image, title = it.title, subTitle = it.subTitle)
            }
        }
        Box(
            modifier = modifier
                .height(290.dp)
                .fillMaxWidth()
                .background(
                    Color(0xFF73E53F)
                ),
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = "https://images.tokopedia.net/img/cache/240/zssuBf/2023/7/18/698df21c-4678-43d4-a348-f648c102e971.png.webp?ect=4g"),
                contentDescription = "",
                modifier = modifier
                    .height(275.dp)
                    .width(140.dp)
                    .graphicsLayer {
                        translationX =
                            if (lazyListState.firstVisibleItemScrollOffset >= 100) 0f - lazyListState.firstVisibleItemScrollOffset else 0f
//                        translationX =
//                            if (lazyListState.firstVisibleItemScrollOffset >= 100) -100f else 0f - lazyListState.firstVisibleItemScrollOffset
                    },
                contentScale = ContentScale.FillWidth,
            )
            LazyRow(
                contentPadding = PaddingValues(), modifier = modifier,
                state = lazyListState
            ) {
                item {
                    Box(
                        modifier = modifier
                            .height(275.dp)
                            .width(140.dp)
                    )
                }
                items(continueCheckState, key = { it.image }) {
                    CardItemDiscount(
                        paddingEnd = 10.dp,
                        imageUrl = it.image,
                        title = it.title,
                        subTitle = it.subTitle,
                        paddingTop = 12.dp
                    )
                }
            }
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageHorizontalPager(
    modifier: Modifier = Modifier,
    items: List<String>
) {
    Column(modifier = Modifier) {
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

        Row(
            Modifier
                .height(50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(items.size) { iteration ->
                val color =
                    if (pagerState.currentPage % items.size == iteration) PrimaryColor else Color.LightGray
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(10.dp),
                )
            }
        }
    }
}
