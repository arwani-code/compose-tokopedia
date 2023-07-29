package com.gqlui.tokpediaclone.ui.utils

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.progressSemantics
import androidx.compose.material.ProgressIndicatorDefaults
import androidx.compose.material3.TabPosition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor
import kotlin.math.abs

fun Modifier.bottomElevation(): Modifier = this.then(Modifier.drawWithContent {
    val paddingPx = 8.dp.toPx()
    clipRect(
        left = 0f,
        top = 0f,
        right = size.width,
        bottom = size.height + paddingPx
    ) {
        this@drawWithContent.drawContent()
    }
})

@OptIn(ExperimentalFoundationApi::class)
fun Modifier.wormTransition(
    pagerState: PagerState
) =
    drawBehind {
        val distance = size.width + 5.dp.roundToPx()
        val scrollPosition = pagerState.currentPage + pagerState.currentPageOffsetFraction
        val wormOffset = (scrollPosition % 1) * 2

        val xPos = scrollPosition.toInt() * distance
        val head = xPos + distance * 0f.coerceAtLeast(wormOffset - 1)
        val tail = xPos + size.width + 1f.coerceAtMost(wormOffset) * distance

        val worm = RoundRect(
            head, 0f, tail, size.height,
            CornerRadius(50f)
        )

        val path = Path().apply {
            addRoundRect(worm)
        }
        drawPath(path = path, color = PrimaryColor)
    }

@Composable
fun CustomProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = Color(0xFFF7F5F2),
    backgroundColor: Color = Color(0xFFDFDFDE),
    strokeCap: StrokeCap = StrokeCap.Butt,
) {
    val infiniteTransition = rememberInfiniteTransition(label = "")
    val firstLineHead by infiniteTransition.animateFloat(
        0f,
        1f,
        infiniteRepeatable(
            animation = keyframes {
                durationMillis = 1400
                0f at 0 with CubicBezierEasing(0f, -0.6f, 0f, 1f)
                1f at 400
            }
        ), label = ""
    )
    val firstLineTail by infiniteTransition.animateFloat(
        0f,
        1f,
        infiniteRepeatable(
            animation = keyframes {
                durationMillis = 1400
                0f at 0 with CubicBezierEasing(0f, -0.6f, 1f, 1f)
                1f at 900
            }
        ), label = ""
    )
    val secondLineHead by infiniteTransition.animateFloat(
        0f,
        1f,
        infiniteRepeatable(
            animation = keyframes {
                durationMillis = 1400
                0f at 1000 with CubicBezierEasing(1f, 0f, 0f, 1f)
                1f at 1000
            }
        ), label = ""
    )
    val secondLineTail by infiniteTransition.animateFloat(
        0f,
        1f,
        infiniteRepeatable(
            animation = keyframes {
                durationMillis = 1400
                0f at 433 with CubicBezierEasing(0f, 0f, 0f, 1f)
                1f at 1000
            }
        ), label = ""
    )
    Canvas(
        modifier
            .progressSemantics()
            .size(240.dp, ProgressIndicatorDefaults.StrokeWidth),
    ) {
        val strokeWidth = size.height
        drawLinearIndicatorBackground(backgroundColor, strokeWidth, strokeCap)
        if (firstLineHead - firstLineTail > 0) {
            drawLinearIndicator(
                firstLineHead,
                firstLineTail,
                color,
                strokeWidth,
                strokeCap,
            )
        }
        if ((secondLineHead - secondLineTail) > 0) {
            drawLinearIndicator(
                secondLineHead,
                secondLineTail,
                color,
                strokeWidth,
                strokeCap,
            )
        }
    }
}

private fun DrawScope.drawLinearIndicatorBackground(
    color: Color,
    strokeWidth: Float,
    strokeCap: StrokeCap,
) = drawLinearIndicator(0f, 1f, color, strokeWidth, strokeCap)

private fun DrawScope.drawLinearIndicator(
    startFraction: Float,
    endFraction: Float,
    color: Color,
    strokeWidth: Float,
    strokeCap: StrokeCap,
) {
    val width = size.width
    val height = size.height
    // Start drawing from the vertical center of the stroke
    val yOffset = height / 2

    val isLtr = layoutDirection == LayoutDirection.Ltr
    val barStart = (if (isLtr) startFraction else 1f - endFraction) * width
    val barEnd = (if (isLtr) endFraction else 1f - startFraction) * width

    // if there isn't enough space to draw the stroke caps, fall back to StrokeCap.Butt
    if (strokeCap == StrokeCap.Butt || height > width) {
        // Progress line
        drawLine(color, Offset(barStart, yOffset), Offset(barEnd, yOffset), strokeWidth)
    } else {
        // need to adjust barStart and barEnd for the stroke caps
        val strokeCapOffset = strokeWidth / 2
        val coerceRange = strokeCapOffset..(width - strokeCapOffset)
        val adjustedBarStart = barStart.coerceIn(coerceRange)
        val adjustedBarEnd = barEnd.coerceIn(coerceRange)

        if (abs(endFraction - startFraction) > 0) {
            // Progress line
            drawLine(
                color,
                Offset(adjustedBarStart, yOffset),
                Offset(adjustedBarEnd, yOffset),
                strokeWidth,
                strokeCap,
            )
        }
    }
}

fun String.imgUrl(): String {
    return "https://images.tokopedia.net/img/cache/$this"
}


fun Modifier.customTabIndicatorOffset(
    currentTabPosition: TabPosition,
    tabWidth: Dp
): Modifier = composed(
    inspectorInfo = debugInspectorInfo {
        name = "customTabIndicatorOffset"
        value = currentTabPosition
    }
) {
    val currentTabWidth by animateDpAsState(
        targetValue = tabWidth,
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing), label = ""
    )
    val indicatorOffset by animateDpAsState(
        targetValue = ((currentTabPosition.left + currentTabPosition.right - tabWidth) / 2),
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing), label = ""
    )
    fillMaxWidth()
        .wrapContentSize(Alignment.TopStart)
        .offset(x = indicatorOffset)
        .width(currentTabWidth)
//        .graphicsLayer { translationY =  }
}