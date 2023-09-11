package com.baharudin.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.ui.graphics.vector.ImageVector

const val navigationRouteOnBoarding = "on_boarding"
const val navigationRouteOnBoardingFirst = "on_boarding_first"
const val navigationRouteOnBoardingSecond = "on_boarding_second"
const val navigationRouteOnBoardingThird = "on_boarding_third"

const val navigationRouteHome = "home"
const val navigationRouteDashboard = "dashboard"
const val navigationRouteFavorite = "favorit"
const val navigationRouteSearch = "search"

sealed class Screen(
    val route: String,
    var routePath: String? = null,
    var clearBackStack: Boolean = false,
    val restoreState: Boolean = true,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    fun withClearBackStack() = apply {
        clearBackStack = true
    }

    fun routeWith(path: String) = apply {
        routePath = path
    }

    object OnBoarding : Screen(navigationRouteDashboard)
    object OnboardingFirst : Screen(navigationRouteOnBoardingFirst)
    object OnboardingTwo : Screen(navigationRouteOnBoardingSecond)
    object OnboardingThree : Screen(navigationRouteOnBoardingThird)

    object Home : Screen(navigationRouteHome)
    object Dashboard :
        Screen(route = navigationRouteDashboard, title = "Dashboard", icon = Icons.Rounded.Home)

    object Search :
        Screen(route = navigationRouteSearch, title = "Search", icon = Icons.Rounded.Search)

    object Favorit :
        Screen(route = navigationRouteFavorite, title = "Favorit", icon = Icons.Rounded.Favorite)
}