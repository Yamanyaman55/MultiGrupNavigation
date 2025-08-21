package com.example.multigroup.ui.profileeditscreen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.multigroup.ui.route.Screen


@Composable
fun ProfileEditScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.scrim),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
           Text(
               "Profile Edit Screen",
               modifier = Modifier,
               color = MaterialTheme.colorScheme.secondary,
               style = MaterialTheme.typography.bodySmall
               )

        Spacer(modifier = Modifier.size(12.dp))


           Text(
               "Navigate Back",
               modifier = Modifier.clickable{
                   navController.popBackStack()
               },
               color = MaterialTheme.colorScheme.secondary,
               style = MaterialTheme.typography.displayMedium
           )

        Spacer(modifier = Modifier.size(12.dp))

        Text(
            "Navigate to Detail Screen inclusive True",
            modifier = Modifier.clickable{
                navController.popBackStack(Screen.Detail.route,true)
            },
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.bodySmall
        )

        Spacer(modifier = Modifier.size(12.dp))

        Text(
            "popbackstack Detail Screen False",
            modifier = Modifier.clickable{
                navController.popBackStack(Screen.Detail.route,false)
            },
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.bodySmall
        )

      Spacer(modifier = Modifier.size(12.dp))

        Text(
            "Navigate to Home",
            modifier = Modifier.clickable{
                navController.popBackStack(Screen.Home.route,false)
            },
            color = MaterialTheme.colorScheme.secondary,
            style= MaterialTheme.typography.bodySmall



        )






    }


}