package com.baharudin.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.baharudin.navigation.Screen

@Composable
fun OnBoardingGraph(
    modifier : Modifier = Modifier,
    navController : NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.OnboardingFirst.route,
        modifier = modifier
    ){
        // TODO : add your sceeen here
    }
}