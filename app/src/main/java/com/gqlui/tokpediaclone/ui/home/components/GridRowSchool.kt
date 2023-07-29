package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
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
import com.gqlui.tokpediaclone.ui.components.MaxDivider

@Composable
fun GridRowSchool(
    modifier: Modifier = Modifier,
    needsSchool: List<RowHomeIc>,
) {
    val context = LocalContext.current
    Column(modifier = modifier.fillMaxWidth()) {
        TitleSection(title = "Ribuan Kebutuhan Sekolah", canShowTextButton = false, paddingVertical = 10.dp)
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(260.dp)
        ) {
            LazyHorizontalGrid(
                rows = GridCells.Fixed(2),
                modifier = modifier.fillMaxSize(),
                userScrollEnabled = false,
            ) {
                itemsIndexed(needsSchool) { index, data ->
                    AsyncImage(
                        model = ImageRequest.Builder(context).data(data.image).build(),
                        contentDescription = "image",
                        contentScale = ContentScale.FillBounds,
                        modifier = modifier
                            .padding(
                                top = 4.dp,
                                end = if (index % 2 != 0) 4.dp else 0.dp,
                            )
                            .width(205.dp)
                            .height(200.dp)
                    )
                }
            }
        }
        MaxDivider()
    }
}