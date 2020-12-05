package com.fjbg.navcompose.view

import androidx.compose.runtime.Composable

@Composable
fun view2(action: () -> Unit) {
    common("this is the SecondView", action)
}

