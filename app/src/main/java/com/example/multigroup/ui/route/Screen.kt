package com.example.multigroup.ui.route

sealed class Screen (val route : String ) {
    data object Home : Screen("Home Screen")
    data object Detail : Screen ( "Detail Screen")
    data object Profile : Screen ("Profile Screen")

    data object ProfileEditScreen :Screen("ProfileEditScreen")
}