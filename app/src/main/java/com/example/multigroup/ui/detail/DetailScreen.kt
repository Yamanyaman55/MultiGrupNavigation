package com.example.multigroup.ui.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.multigroup.ui.route.Screen


@Composable
fun  DetailScreen(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.primary),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Text(
            "User Detail Screen ",
            modifier = Modifier.clickable{
                navController.popBackStack()
            },
             style = MaterialTheme.typography.bodySmall,
             color = MaterialTheme.colorScheme.error

            )


    }

}