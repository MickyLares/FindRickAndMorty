package com.example.rickandmortyfinder.app

import android.app.Application
import com.example.characterservice.di.initKoinCharacter
import com.example.locationservice.di.initKoinLocation
import com.example.rickandmortyfinder.di.initKoinApp
import com.example.rickandmortyfinder.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModel

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
        }
        initKoinLocation(
            listOf(
                module {}
            )
        )
        initKoinCharacter(
            listOf(
                module {
                    viewModel { MainViewModel(get(), get()) }
                }
            )
        )
        initKoinApp(listOf(module {}))
    }
}