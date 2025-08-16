package com.example.rickandmortyfinder.di

import com.example.rickandmortyfinder.presentation.main.MainViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { MainViewModel(get(), get()) }
}