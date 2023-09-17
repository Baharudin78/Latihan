package com.baharudin.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.baharudin.navigation.Screen

@Composable
fun HomeNavGraph(
    modifier : Modifier = Modifier,
    navController : NavHostController,
    onNavigateToRoot : (Screen) -> Unit
){
    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route,
        modifier = modifier,
    ){
        // TODO : add screen for home navigation here
    }
}