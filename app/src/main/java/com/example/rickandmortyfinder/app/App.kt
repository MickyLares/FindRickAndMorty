package com.example.rickandmortyfinder.app

import android.app.Application
import com.example.rickandmortyfinder.di.initKoinApp

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoinApp(this, emptyList())
    }
}