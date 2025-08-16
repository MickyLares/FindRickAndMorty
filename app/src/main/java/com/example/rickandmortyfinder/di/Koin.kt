package com.example.rickandmortyfinder.di


import android.app.Application
import com.example.characterservice.di.dataCharacterModule
import com.example.characterservice.di.domainCharacterModule
import com.example.locationservice.di.dataLocationModule
import com.example.locationservice.di.domainLocationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.mp.KoinPlatform.getKoin
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun initKoinApp(app: Application, platformModule: List<Module>) {
    startKoin {
        androidContext(app)
        modules(
            dataCharacterModule,
            domainCharacterModule,
            dataLocationModule,
            domainLocationModule,
            dataAppModule,
            presentationModule,
            *platformModule.toTypedArray()
        )
    }
}