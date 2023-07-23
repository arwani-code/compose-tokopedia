package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun GridRowSchool(
    modifier: Modifier = Modifier,
    needsSchool: List<RowHomeIc>,
) {
    val context = LocalContext.current
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = "Ribuan Kebutuhan Sekolah",
            Modifier.padding(vertical = 12.dp, horizontal = 16.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        LazyHorizontalGrid(
            rows = GridCells.Fixed(2),
            modifier = modifier
                .height(260.dp)
                .fillMaxWidth(),
            userScrollEnabled = false
        ) {
            items(needsSchool) {
                AsyncImage(
                    model = ImageRequest.Builder(context).data(it.image).build(),
                    contentDescription = "image",
                    contentScale = ContentScale.FillBounds,
                    modifier = modifier
                        .padding(
                            top = 2.dp,
                            bottom = 2.dp,
                            end = 3.dp,
                            start = 0.dp
                        )
                        .size(200.dp)
                )
            }
        }
    }
}