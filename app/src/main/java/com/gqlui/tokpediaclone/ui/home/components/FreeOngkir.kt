package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun FreeOngkir(
    modifier: Modifier = Modifier,
    freeOngkirs: List<RowHomeIc>
) {
    val colorList = listOf(
        Color(0xFF00D827),
        Color(0xFF05A801),
        Color(0xFFEC6A2A),
        Color(0xFF7D5335),
        Color(0xFFC29875),
    )
    Box(modifier = modifier.fillMaxWidth().background(Color.White)) {
        Box(
            modifier = modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(color = Color(0xFF07AC10))
        )
        Column(modifier = modifier.padding(bottom = 8.dp).fillMaxWidth()) {
            Row(
                modifier = modifier
                    .padding(horizontal = 16.dp, vertical = 12.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Pasti Bebas Ongkir",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(text = "Tanpa minimum belanja", fontSize = 12.sp, color = Color.White)
                }
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent,
                    ),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
                    modifier = modifier
                        .height(35.dp)
                        .width(95.dp)
                ) {
                    Text(
                        text = "Lihat Semua",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
            }
            LazyRow(contentPadding = PaddingValues(horizontal = 12.dp)) {
                items(freeOngkirs) {
                    CardItemDiscount(
                        cardWidth = 135.dp,
                        cardHeight = 330.dp,
                        sizeImage = 130.dp, data = it,
                        colorList = colorList
                    )
                }
            }
        }
    }
}