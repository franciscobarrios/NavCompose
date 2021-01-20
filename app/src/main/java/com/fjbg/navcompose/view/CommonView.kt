package com.fjbg.navcompose.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.fjbg.navcompose.ui.purple500

@Composable
fun common(
    text: String,
    action: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "TopAppBar") },
                backgroundColor = purple500,
                navigationIcon = {
                    IconButton(onClick = action) {
                        Icon(asset = Icons.Filled.ArrowBack)
                    }
                }
            )
        },
        bodyContent = {
            showText(text = text)
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {
            FloatingActionButton(
                onClick = action,
                icon = {
                    Icon(asset = Icons.Default.Add)
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                backgroundColor = purple500,
                cutoutShape = CircleShape
            ) {

            }
        }
    )
}

@Preview
@Composable
fun commonPreview() {
    common("Hello") {}
}

@Composable
fun showText(text: String) {
    Box(Modifier.fillMaxSize()) {
        Text(
            text = text,
            fontSize = 32.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(
                    start = 36.dp,
                    end = 36.dp
                )
        )
    }
}