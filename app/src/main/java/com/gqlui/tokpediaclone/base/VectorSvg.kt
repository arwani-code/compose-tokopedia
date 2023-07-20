package com.gqlui.tokpediaclone.base


import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Composable
fun rememberVectorLocation(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 14.dp,
            defaultHeight = 14.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.02f, 2.809f)
            arcTo(7.67f, 7.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.24f)
            arcTo(7.67f, 7.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.75f, 10f)
            curveToRelative(0f, 7.264f, -6.896f, 11.372f, -7.365f, 11.65f)
            arcToRelative(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.755f, 0.01f)
            lineToRelative(-0.015f, -0.01f)
            curveTo(11.146f, 21.373f, 4.25f, 17.265f, 4.25f, 10f)
            arcToRelative(7.67f, 7.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.77f, -7.191f)
            close()
            moveTo(5.75f, 10f)
            curveToRelative(0f, 5.58f, 4.85f, 9.18f, 6.25f, 10.11f)
            curveToRelative(1.4f, -0.93f, 6.25f, -4.55f, 6.25f, -10.11f)
            arcTo(6.188f, 6.188f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.74f)
            arcTo(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.75f, 10f)
            close()
            moveToRelative(4.168f, -3.129f)
            arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6.24f)
            arcTo(3.76f, 3.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.75f, 10f)
            arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.832f, -3.129f)
            close()
            moveToRelative(0.83f, 4.99f)
            arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.503f, -3.74f)
            arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.502f, 3.74f)
            close()
        }
        }.build()
    }
}


@Composable
fun rememberVectorSearch(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.53f, 19.46f)
            lineToRelative(-4.4f, -4.4f)
            arcToRelative(7.33f, 7.33f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.07f, 1.06f)
            lineToRelative(4.41f, 4.41f)
            arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f)
            arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.07f)
            close()
            moveToRelative(-15.78f, -9f)
            arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.75f, 5.75f)
            arcToRelative(5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.75f, -5.72f)
            verticalLineToRelative(-0.03f)
            close()
        }
        }.build()
    }
}


@Composable
fun rememberVectorMsg(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 4.25f)
                horizontalLineTo(4f)
                arcTo(1.76f, 1.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                verticalLineToRelative(12f)
                arcTo(1.76f, 1.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19.75f)
                horizontalLineToRelative(16f)
                arcTo(1.76f, 1.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 18f)
                verticalLineTo(6f)
                arcTo(1.76f, 1.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4.25f)
                close()
                moveToRelative(-1f, 1.5f)
                lineToRelative(-6.09f, 4.63f)
                arcToRelative(
                    1.32f,
                    1.32f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -1.51f,
                    0f
                )
                lineTo(5.16f, 5.75f)
                horizontalLineTo(19f)
                close()
                moveToRelative(1f, 12.5f)
                horizontalLineTo(4f)
                arcToRelative(
                    0.25f,
                    0.25f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.25f,
                    -0.25f
                )
                verticalLineTo(6.57f)
                lineToRelative(6.71f, 5f)
                arcToRelative(
                    2.86f,
                    2.86f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    3.29f,
                    0f
                )
                lineToRelative(6.5f, -4.94f)
                verticalLineTo(18f)
                arcToRelative(
                    0.25f,
                    0.25f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.25f,
                    0.25f
                )
                close()
            }
        }.build()
    }
}


@Composable
fun rememberVectorNotif(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(21f, 17.25f)
                horizontalLineToRelative(-1.25f)
                verticalLineTo(11f)
                arcToRelative(
                    7.76f,
                    7.76f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -6.06f,
                    -7.56f
                )
                arcToRelative(
                    2.12f,
                    2.12f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0.06f,
                    -0.44f
                )
                arcToRelative(
                    1.75f,
                    1.75f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -3.5f,
                    0f
                )
                curveToRelative(0.005f, 0.148f, 0.025f, 0.296f, 0.06f, 0.44f)
                arcTo(7.76f, 7.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.25f, 11f)
                verticalLineToRelative(6.25f)
                horizontalLineTo(3f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    0f,
                    1.5f
                )
                horizontalLineToRelative(5.25f)
                verticalLineTo(19f)
                arcToRelative(
                    3.75f,
                    3.75f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    7.5f,
                    0f
                )
                verticalLineToRelative(-0.25f)
                horizontalLineTo(21f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    0f,
                    -1.5f
                )
                close()
                moveTo(14.25f, 19f)
                arcToRelative(
                    2.25f,
                    2.25f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -4.5f,
                    0f
                )
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(19f)
                close()
                moveToRelative(0.75f, -1.75f)
                horizontalLineTo(5.75f)
                verticalLineTo(11f)
                arcToRelative(
                    6.25f,
                    6.25f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    12.5f,
                    0f
                )
                verticalLineToRelative(6.25f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberVectorCart(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(21.68f, 7.56f)
                arcToRelative(
                    1.908f,
                    1.908f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.35f,
                    -0.66f
                )
                arcToRelative(
                    1.71f,
                    1.71f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.58f,
                    -0.46f
                )
                arcToRelative(
                    1.85f,
                    1.85f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.75f,
                    -0.19f
                )
                horizontalLineTo(6.17f)
                arcToRelative(
                    1.82f,
                    1.82f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.57f,
                    0.13f
                )
                lineToRelative(-0.06f, -0.3f)
                arcToRelative(
                    1.91f,
                    1.91f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -2f,
                    -1.83f
                )
                horizontalLineToRelative(-1f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0f,
                    1.5f
                )
                horizontalLineToRelative(1f)
                curveToRelative(0.42f, 0f, 0.49f, 0.07f, 0.57f, 0.59f)
                lineToRelative(1.09f, 5.54f)
                lineToRelative(0.54f, 2.78f)
                arcTo(3.86f, 3.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16.89f)
                arcToRelative(
                    3.76f,
                    3.76f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    1.54f,
                    0.75f
                )
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                arcToRelative(
                    2f,
                    2f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.46f,
                    -1.25f
                )
                horizontalLineToRelative(2.88f)
                arcToRelative(
                    2f,
                    2f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    3.06f,
                    -0.12f
                )
                arcToRelative(
                    3.8f,
                    3.8f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    1.46f,
                    -0.7f
                )
                arcToRelative(
                    3.71f,
                    3.71f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    1.32f,
                    -2.1f
                )
                lineToRelative(1.47f, -6.46f)
                verticalLineTo(8.3f)
                arcToRelative(
                    1.68f,
                    1.68f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.05f,
                    -0.74f
                )
                close()
                moveToRelative(-2.89f, 6.93f)
                arcToRelative(
                    2.24f,
                    2.24f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -2.2f,
                    1.76f
                )
                horizontalLineTo(9.38f)
                arcToRelative(
                    2.25f,
                    2.25f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -2.19f,
                    -1.82f
                )
                lineTo(6f, 8.1f)
                arcTo(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                verticalLineToRelative(-0.14f)
                arcToRelative(
                    0.39f,
                    0.39f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0.1f,
                    -0.08f
                )
                horizontalLineTo(20f)
                arcToRelative(
                    0.28f,
                    0.28f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0.13f,
                    0f
                )
                arcToRelative(
                    0.389f,
                    0.389f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0.1f,
                    0.08f
                )
                curveToRelative(0.03f, 0.03f, 0.05f, 0.069f, 0.06f, 0.11f)
                arcToRelative(
                    0.405f,
                    0.405f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0f,
                    0.11f
                )
                lineToRelative(-1.5f, 6.41f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberVectorMenu(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.75f)
                horizontalLineToRelative(14f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    0f,
                    -1.5f
                )
                horizontalLineTo(5f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0f,
                    1.5f
                )
                close()
                moveToRelative(14f, 4.5f)
                horizontalLineTo(5f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    0f,
                    1.5f
                )
                horizontalLineToRelative(14f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    0f,
                    -1.5f
                )
                close()
                moveToRelative(-14f, 6f)
                horizontalLineToRelative(14f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    0f,
                    1.5f
                )
                horizontalLineTo(5f)
                arcToRelative(
                    0.75f,
                    0.75f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    0f,
                    -1.5f
                )
                close()
            }
        }.build()
    }
}
