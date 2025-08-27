package com.example.rickandmortyfinder.presentation.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import com.example.rickandmortyfinder.presentation.main.home.HomeScreen
import com.example.rickandmortyfinder.presentation.main.onBoarding.OnBoardingScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainViewModel = koinViewModel<MainViewModel>(),
    onMenuClick: (route: String) -> Unit,
    toDetailCharacter: (id: Int) -> Unit
) {
    val showOnBoarding by viewModel.showOnBoarding.collectAsState()
    viewModel.start()
    when (showOnBoarding) {
        true -> {
            OnBoardingScreen(navController, viewModel)
        }

        false -> {
            HomeScreen(
                viewModel = viewModel,
                onNavigate = { route -> onMenuClick.invoke(route) }
            ) { id ->
                toDetailCharacter.invoke(id)
            }
        }
    }
}