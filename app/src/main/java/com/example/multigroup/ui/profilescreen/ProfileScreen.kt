package com.example.multigroup.ui.profilescreen

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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.multigroup.ui.route.Screen


@Composable
fun ProfileScreen(navController: NavHostController,profile: String?) {

    val savedStateHandle = navController.currentBackStackEntry?.savedStateHandle
    val result = savedStateHandle?.get<String>("result_key")

    LaunchedEffect(result) {
        result?.let {
            savedStateHandle.remove<String>("result_key")
        }
    }




    Column(
        modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.error),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text("Profile Screen",
            modifier = Modifier.clickable{
                navController.navigate(Screen.ProfileEditScreen.route)
            },
            color = MaterialTheme.colorScheme.scrim,
            style = MaterialTheme.typography.bodySmall
        )

        Spacer(modifier=Modifier.size(12.dp) )

        Text(
            "profile argument::: $profile",
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.bodyLarge

        )


      Spacer(modifier=Modifier.size(12.dp))

        Text(
            "Profile Edit Screen'den aldıgımız data :: $result",
            color = MaterialTheme.colorScheme.scrim,
            style = MaterialTheme.typography.bodySmall
        )

    }


}