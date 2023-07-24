package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor

@Composable
fun PromoToday(
    modifier: Modifier = Modifier,
    data: List<RowHomeIc>
) {
    val context = LocalContext.current
    Column(modifier = modifier.fillMaxSize()) {
        Row(
            modifier = modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Pilihan Promo Hari ini", fontWeight = FontWeight.Bold)
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Lihat Semua", fontWeight = FontWeight.Bold, fontSize = 12.sp,
                    color = PrimaryColor
                )
            }
        }
        LazyRow(contentPadding = PaddingValues(horizontal = 10.dp), modifier = modifier.fillMaxSize()) {
            items(data, key = { it.image }) {
                Card(
                    shape = RoundedCornerShape(12.dp),
                    modifier = modifier
                        .padding(horizontal = 4.dp)
                        .height(250.dp)
                        .width(140.dp)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(context).data(it.image).build(),
                        contentDescription = "image",
                        contentScale = ContentScale.FillBounds,
                        modifier = modifier.fillMaxSize()
                    )
                }
            }
        }
        Spacer(modifier = modifier.height(10.dp))
        MaxDivider()
    }
}