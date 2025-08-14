package com.example.rickandmortyfinder.di


import org.koin.core.module.Module
import org.koin.mp.KoinPlatform.getKoin
import org.koin.core.context.startKoin

fun initKoinApp(platformModule: List<Module>){
    val koin = try {
        getKoin()
    }catch (e: Exception){
        startKoin {  }.koin
    }

    koin.loadModules(
        listOf(
            dataAppModule,
            *platformModule.toTypedArray()
        )
    )
}