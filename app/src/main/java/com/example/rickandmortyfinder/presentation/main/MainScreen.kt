package com.example.rickandmortyfinder.presentation.main

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainViewModel = koinViewModel<MainViewModel>(),
    toDetailCharacter: (id: Int) -> Unit
){
    val showOnBoarding by viewModel.showOnBoarding.collectAsState()
    when(showOnBoarding){
        true -> {
            OnBoardingScreen(navController, viewModel)
        }
        false -> {
            Text("parece que no entra en el onBoarding")
        }
    }
}