package com.fjbg.navcompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fjbg.navcompose.nav.Action
import com.fjbg.navcompose.nav.Destinations.Home
import com.fjbg.navcompose.nav.Destinations.View1
import com.fjbg.navcompose.nav.Destinations.View2
import com.fjbg.navcompose.nav.Destinations.View3
import com.fjbg.navcompose.ui.NavComposeTheme
import com.fjbg.navcompose.view.home
import com.fjbg.navcompose.view.view1
import com.fjbg.navcompose.view.view2
import com.fjbg.navcompose.view.view3

@Composable
fun navComposeApp() {
    val navController = rememberNavController()
    val actions = remember(navController) { Action(navController) }
    NavComposeTheme {
        NavHost(
            navController = navController,
            startDestination = Home
        ) {
            composable(Home) {
                home(action = actions.view1)
            }
            composable(View1) {
                view1(action = actions.view2)
            }
            composable(View2) {
                view2(action = actions.view3)
            }
            composable(View3) {
                view3()
            }
        }
    }
}