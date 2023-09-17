package com.baharudin.navigation.ext

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.baharudin.navigation.Screen

fun NavController.navigateTo(
    screen: Screen
) {
    val currentRoute: String? = this.currentBackStackEntry?.destination?.route
    val route = screen.routePath?.let { routePath ->
        screen.route.replaceAfter("/", routePath)
    } ?: screen.route

    navigate(route) {
        popUpTo(graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = screen.restoreState

        if (screen.clearBackStack && !currentRoute.isNullOrEmpty()) {
            popUpTo(currentRoute) {
                inclusive = true
            }
        }
    }
}

