package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import com.gqlui.tokpediaclone.ui.components.MaxDivider
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor

@Composable
fun VitaminAndSupplement(
    modifier: Modifier = Modifier,
    vitaminAndSupplements: List<RowHomeIc>
) {
    val context = LocalContext.current
    Column {
        Row(
            modifier = modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Vitamin dan Suplemen", fontWeight = FontWeight.Bold)
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Lihat Semua", color = PrimaryColor, fontWeight = FontWeight.Bold)
            }
        }
        LazyVerticalGrid(columns = GridCells.Fixed(3), modifier = modifier.height(230.dp)) {
            items(vitaminAndSupplements) {
                AsyncImage(
                    model = ImageRequest.Builder(context).data(it.image).build(),
                    contentDescription = "image",
                    contentScale = ContentScale.FillBounds,
                    modifier = modifier
                )
            }
        }
        MaxDivider()
    }
}