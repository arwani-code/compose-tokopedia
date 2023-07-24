package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun RowIconItem(
    modifier: Modifier = Modifier,
    image: String,
    title: String
) {
    Box(
        modifier = modifier
            .padding(bottom = 10.dp)
            .width(70.dp),
    ) {
        Column(
            modifier = modifier
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = image),
                contentDescription = "",
                modifier.size(30.dp)
            )
            Text(
                text = title, fontSize = 12.sp, style = TextStyle(
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.sp,
                ),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

