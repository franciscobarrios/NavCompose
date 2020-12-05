package com.fjbg.navcompose.view

import androidx.compose.runtime.Composable

@Composable
fun home(action: () -> Unit) {
    common(
        text = "this is Home",
        action = action
    )
}

