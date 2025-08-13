package com.example.locationservice.di

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.mp.KoinPlatform.getKoin

fun initKoinLocation(platformModules: List<Module>) {

    val koin = try {
        getKoin()
    } catch (e: Exception) {
        startKoin { }.koin
    }

    koin.loadModules(
        listOf(
            dataLocationModule,
            domainLocationModule,
            *platformModules.toTypedArray()
        )
    )
}