package com.gqlui.tokpediaclone.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gqlui.tokpediaclone.base.rememberVectorCart
import com.gqlui.tokpediaclone.base.rememberVectorMenu
import com.gqlui.tokpediaclone.base.rememberVectorMsg
import com.gqlui.tokpediaclone.base.rememberVectorNotif
import com.gqlui.tokpediaclone.base.rememberVectorSearch
import com.gqlui.tokpediaclone.ui.theme.BoxRed
import com.gqlui.tokpediaclone.ui.theme.PrimaryColor

@Composable
fun TkpTopAppBar(
    modifier: Modifier = Modifier,
    tinColor: Color = Color.White,
    bgColor: Color = PrimaryColor,
    isScrollInProgress: Boolean = false
) {

    var value by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(bgColor)
    ) {
        Row(
            modifier = modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = modifier
                    .width(220.dp)
                    .heightIn(max = 30.dp)
            ) {
                BasicTextField(
                    value = value,
                    onValueChange = { value = it },
                    decorationBox = { innerTextField ->
                        Row(
                            Modifier
                                .background(Color.White, RoundedCornerShape(percent = 20))
                                .fillMaxSize()
                                .border(
                                    width = 1.dp,
                                    color = Color.LightGray,
                                    shape = RoundedCornerShape(percent = 20)
                                ),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                rememberVectorSearch(),
                                contentDescription = "",
                                tint = Color.Gray,
                                modifier = modifier
                                    .padding(horizontal = 4.dp)
                                    .size(12.dp)
                            )
                            Text(text = "Cari di Tokopedia", fontSize = 16.sp, color = Color.Gray)
                            innerTextField()
                        }
                    },
                    cursorBrush = Brush.verticalGradient(
                        colors = listOf(PrimaryColor, PrimaryColor)
                    ),
                )
            }
            Box(
                modifier = modifier,
                contentAlignment = Alignment.TopEnd
            ) {
                Icon(
                    imageVector = rememberVectorMsg(),
                    contentDescription = "",
                    modifier = modifier.size(25.dp),
                    tint = tinColor
                )
                Box(
                    modifier = modifier
                        .clip(RoundedCornerShape(12.dp))
                        .size(14.dp)
                        .background(BoxRed), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "2",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Box(
                modifier = modifier,
                contentAlignment = Alignment.TopEnd
            ) {
                Icon(
                    imageVector = rememberVectorNotif(),
                    contentDescription = "",
                    modifier = modifier.size(25.dp),
                    tint = tinColor
                )
                Box(
                    modifier = modifier
                        .clip(RoundedCornerShape(12.dp))
                        .size(14.dp)
                        .background(BoxRed), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "1",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Box(
                modifier = modifier,
                contentAlignment = Alignment.TopEnd
            ) {
                Icon(
                    imageVector = rememberVectorCart(), contentDescription = "",
                    modifier = modifier.size(25.dp),
                    tint = tinColor
                )
                Box(
                    modifier = modifier
                        .clip(RoundedCornerShape(12.dp))
                        .size(14.dp)
                        .background(BoxRed), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "3",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Box(
                modifier = modifier,
                contentAlignment = Alignment.TopEnd
            ) {
                Icon(
                    imageVector = rememberVectorMenu(),
                    contentDescription = "",
                    modifier = modifier.size(25.dp),
                    tint = tinColor
                )
                Box(
                    modifier = modifier
                        .padding(end = 2.dp)
                        .clip(CircleShape)
                        .size(8.dp)
                        .background(BoxRed)
                )
            }
        }
        if (isScrollInProgress) {
            Divider(
                thickness = 1.dp,
                color = Color.Black.copy(alpha = 0.1f)
            )
        }
    }
}


@Composable
fun MaxDivider(modifier: Modifier = Modifier) {
    Divider(color = Color.LightGray.copy(alpha = 0.3f), modifier = modifier.height(10.dp))
}
