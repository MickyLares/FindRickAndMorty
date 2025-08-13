package com.example.characterservice.di

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.mp.KoinPlatform.getKoin

fun initKoinCharacter(platformModule: List<Module>) {

    val koin = try {
        getKoin()
    } catch (e: Exception) {
        startKoin { }.koin
    }

    koin.loadModules(
        listOf(
            dataCharacterModule,
            domainCharacterModule,
            *platformModule.toTypedArray()
        )
    )
}