package com.fjbg.navcompose.nav

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.fjbg.navcompose.nav.Destinations.Home
import com.fjbg.navcompose.nav.Destinations.View1
import com.fjbg.navcompose.nav.Destinations.View2
import com.fjbg.navcompose.nav.Destinations.View3

object Destinations {
    const val Home = "home"
    const val View1 = "view1"
    const val View2 = "view2"
    const val View3 = "view3"
}

class Action(navController: NavHostController) {
    val home: () -> Unit = { navController.navigate(Home) }
    val view1: () -> Unit = { navController.navigate(View1) }
    val view2: () -> Unit = { navController.navigate(View2) }
    val view3: () -> Unit = { navController.navigate(View3) }
    val navigateBack: () -> Unit = { navController.popBackStack() }
}