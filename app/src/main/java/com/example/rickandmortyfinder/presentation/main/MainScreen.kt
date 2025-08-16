package com.example.rickandmortyfinder.presentation.main

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel = koinViewModel<MainViewModel>(),
    toDetailCharacter: (id: Int) -> Unit
){
    val showOnBoarding by viewModel.showOnBoarding.collectAsState()
    when(showOnBoarding){
        true -> {
            Log.d("TAG", "MainScreen: Se muestra")
        }
        false -> {
            Log.d("TAG", "MainScreen: No Se muestra")
        }
        null -> {
            Log.d("TAG", "MainScreen: Cargando")
        }
    }
}