package com.baharudin.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.baharudin.navigation.graph.HomeNavGraph
import com.baharudin.navigation.graph.OnBoardingGraph

fun NavGraphBuilder.homeNavGraph(onNavigateToRoot: (Screen) -> Unit) {
    composable(
        route = Screen.Home.route
    ){
        val navController = rememberNavController()
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        val bottonBar : @Composable () -> Unit = {
            // TODO : add home botton navigation
        }

        val nestedNavGraph : @Composable () -> Unit = {
            HomeNavGraph(
                navController = navController,
                onNavigateToRoot = onNavigateToRoot
            )
        }
        // TODO : add home screen here
    }
}

fun NavGraphBuilder.onBoardingNavGraph(onNavigateToRoot : (Screen) -> Unit) {
    composable(
        route = Screen.OnBoarding.route
    ){
        val navController = rememberNavController()
        val nestedNavGraph : @Composable () -> Unit = {
            OnBoardingGraph(
                navController = navController
            )
        }

        // TODO : add onboarding screen here
    }
}

fun NavGraphBuilder.onBoardingFirstScreen(){
    composable(
        route = Screen.OnboardingFirst.route
    ){
        // TODO : add onboarding first screen here
    }
}

fun NavGraphBuilder.onBoardingSecondScreen(){
    composable(
        route = Screen.OnboardingTwo.route
    ){
        // TODO : add onboarding first screen here
    }
}

fun NavGraphBuilder.onBoardingThirdtScreen(){
    composable(
        route = Screen.OnboardingThree.route
    ){
        // TODO : add onboarding first screen here
    }
}



