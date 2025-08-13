package com.example.characterservice.di

import androidx.room.Room
import com.example.characterservice.data.dataSource.implementation.RemoteCharacterDataSource
import com.example.characterservice.data.dataSource.interfaces.CharacterDataSource
import com.example.characterservice.data.repository.CharacterRepository
import com.example.characterservice.data.repository.DefaultCharacterRepository
import com.example.characterservice.db.AppDataBase
import com.example.characterservice.db.CharacterDao
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.gson.gson
import org.koin.dsl.module

val dataCharacterModule = module {
    single {
        HttpClient {
            install(ContentNegotiation) {
                gson {
                    setPrettyPrinting()
                    serializeNulls()
                }
            }
        }
    }
    single {
        Room.databaseBuilder(get(), AppDataBase::class.java, "character-db")
            .fallbackToDestructiveMigration(false)
            .build()
    }
    single<CharacterDao> { get<AppDataBase>().characterDao() }
    single<CharacterDataSource> { RemoteCharacterDataSource(get(), get()) }
    single<CharacterRepository> { DefaultCharacterRepository(get()) }
}