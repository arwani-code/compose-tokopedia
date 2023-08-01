package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gqlui.tokpediaclone.ui.utils.customTabIndicatorOffset

@Composable
fun HomeScrollableTabRow(
    modifier: Modifier = Modifier,
    tabs: List<String>,
    selectedTabIndex: Int,
    onTabClick: (Int) -> Unit,
    tabsHeight: Dp,
) {
    val density = LocalDensity.current
    val tabWidths = remember {
        val tabWidthStateList = mutableStateListOf<Dp>()
        repeat(tabs.size) {
            tabWidthStateList.add(0.dp)
        }
        tabWidthStateList
    }

    val tabBackground = listOf(
        listOf(
            Color(0xFF9F206E),
            Color(0xFFAC2077),
            Color(0xFFB3207E),
            Color(0xFFBC2183),
        ),
        listOf(
            Color(0xFFEF9C10),
            Color(0xFFF4A40D),
            Color(0xFFF8AF0A),
            Color(0xFFFCBA04),
        ),
        listOf(
            Color(0xFF562292),
            Color(0xFF60219D),
            Color(0xFF6B21A7),
            Color(0xFF7520B3),
        ),
        listOf(
            Color(0xFF0C84A9),
            Color(0xFF0F91A9),
            Color(0xFF18A3AA),
            Color(0xFF19A9A9),
        ),
        listOf(
            Color(0xFF189547),
            Color(0xFF279F46),
            Color(0xFF33A948),
            Color(0xFF3BAE49),
        ),
    )
    ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        edgePadding = 16.dp,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier
                    .customTabIndicatorOffset(
                        currentTabPosition = tabPositions[selectedTabIndex],
                        tabWidth = 30.dp,
                    )
                    .graphicsLayer {
                        translationY = 20f
                        translationX = -75f
                    },
                color = Color.White
            )
        },
        divider = {
            Divider(color = Color.White)
        },
    ) {
        tabs.forEachIndexed { tabIndex, tab ->
            Card(
                shape = RoundedCornerShape(10.dp),
                modifier = modifier
                    .padding(horizontal = 1.dp)
                    .height(tabsHeight)
                    .width(110.dp),
            ) {
                Tab(
                    selected = selectedTabIndex == tabIndex,
                    onClick = { onTabClick(tabIndex) },
                    text = {
                        Text(
                            text = tab,
                            onTextLayout = { textLayoutResult ->
                                tabWidths[tabIndex] =
                                    with(density) { textLayoutResult.size.width.toDp() }
                            },
                            fontWeight = FontWeight.Bold,
                            lineHeight = 14.sp,
                            textAlign = TextAlign.Start,
//                            maxLines = 1,
//                            overflow = if (tabsHeight.value > 50f) TextOverflow.Clip else TextOverflow.Ellipsis
                        )
                    },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White,
                    modifier = modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = if (tabIndex <= 4) tabBackground[tabIndex] else tabBackground.first()
                            )
                        )
                )
            }
        }
    }
}