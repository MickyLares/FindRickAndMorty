package com.example.rickandmortyfinder.presentation.main.home

import CarouselHome
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.rickandmortyfinder.presentation.main.MainViewModel

@Composable
fun HomeScreen(viewModel: MainViewModel, onClickCard: (id: Int) -> Unit) {
    Scaffold(
        topBar = {},
        bottomBar = {}
    ) { paddingValues ->

        CarouselHome(paddingValues, viewModel) { id ->
            onClickCard.invoke(id)
        }

    }
}