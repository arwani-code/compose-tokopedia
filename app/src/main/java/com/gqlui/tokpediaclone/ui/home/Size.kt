package com.gqlui.tokpediaclone.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

class Size {
    @Composable
    fun height(): Int {
        val configuration = LocalConfiguration.current
        return configuration.screenHeightDp
    }

    @Composable
    fun width(): Int {
        val configuration = LocalConfiguration.current
        return configuration.screenWidthDp
    }
}