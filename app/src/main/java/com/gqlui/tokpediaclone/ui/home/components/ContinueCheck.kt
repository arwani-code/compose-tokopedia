package com.gqlui.tokpediaclone.ui.home.components

import android.util.Log
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gqlui.tokpediaclone.data.model.RowHomeIc

@Composable
fun ContinueCheck(
    modifier: Modifier = Modifier,
    continueCheckState: List<RowHomeIc>
) {
    val scrollState = rememberLazyListState()
    Text(
        text = "Lanjut cek ini, yuk",
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(vertical = 10.dp, horizontal = 16.dp),
        fontSize = 16.sp
    )
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        state = scrollState,
    ) {
        items(continueCheckState, key = { it.image }) {
            CardItemDiscount(data = it)
        }
    }
}