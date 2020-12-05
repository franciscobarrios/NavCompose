package com.fjbg.navcompose.view

import androidx.compose.foundation.Text
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun common(text: String) {
    Scaffold(
        topBar = {},
        bodyContent = {
            showText(text = text)
        },
        bottomBar = {}
    )
}

@Composable
fun showText(text: String) {
    Text(text)
}