package com.example.rickandmortyfinder.di

import com.example.rickandmortyfinder.presentation.details.DetailsCharacters.DetailsCharacterViewModel
import com.example.rickandmortyfinder.presentation.location.LocationViewModel
import com.example.rickandmortyfinder.presentation.main.MainViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { MainViewModel(get(), get()) }
    viewModel { DetailsCharacterViewModel(get(), get()) }
    viewModel { LocationViewModel(get(), get()) }
}