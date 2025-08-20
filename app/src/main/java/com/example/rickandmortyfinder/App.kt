package com.example.rickandmortyfinder

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.rickandmortyfinder.presentation.main.DetailsCharacters.detailCharacterScreen
import com.example.rickandmortyfinder.presentation.main.MainScreen
import kotlinx.serialization.Serializable


@Serializable
object MainDestination

@Serializable
object LocationDestination

@Serializable
data class DetailsCharacterDestination(val id: Int)

@Serializable
data class DetailsLocationDestination(val id: Int)

@Composable
@Preview
fun App() {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) darkColorScheme() else lightColorScheme()
    ) {
        Surface {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = MainDestination) {
                composable<MainDestination> {
                    MainScreen(navController) { id ->
                       navController.navigate(DetailsCharacterDestination(id))
                    }
                }
                composable <DetailsCharacterDestination>{ navBackStackentry->
                    detailCharacterScreen(id = navBackStackentry.toRoute<DetailsCharacterDestination>().id) {
                        navController.popBackStack()
                    }
                }
            }
        }
    }
}