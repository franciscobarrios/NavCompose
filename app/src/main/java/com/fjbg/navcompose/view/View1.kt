package com.fjbg.navcompose.view

import androidx.compose.runtime.Composable

@Composable
fun view1(action: () -> Unit) {
    common(
        text = "this is the FirstView",
        action = action
    )
}

