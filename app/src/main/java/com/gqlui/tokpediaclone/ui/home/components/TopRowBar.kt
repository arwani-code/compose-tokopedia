package com.gqlui.tokpediaclone.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.gqlui.tokpediaclone.base.rememberVectorLocation
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor


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