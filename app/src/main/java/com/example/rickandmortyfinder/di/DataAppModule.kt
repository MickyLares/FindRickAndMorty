package com.example.rickandmortyfinder.di

import androidx.room.Room
import com.example.rickandmortyfinder.data.PreferenceRepository
import com.example.rickandmortyfinder.db.AppDataBase
import com.example.rickandmortyfinder.db.PreferenceDao
import org.koin.dsl.module

val dataAppModule = module {
    single {
        Room.databaseBuilder(get(), AppDataBase::class.java, "preference-db")
            .fallbackToDestructiveMigration(false)
            .build()
    }
    single<PreferenceDao> { get<AppDataBase>().preferenceDao() }
    single { PreferenceRepository(get()) }
}