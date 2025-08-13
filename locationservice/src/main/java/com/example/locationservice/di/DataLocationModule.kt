package com.example.locationservice.di

import androidx.room.Room
import com.example.locationservice.data.dataSource.implementation.RemoteLocationDataSource
import com.example.locationservice.data.dataSource.interfaces.LocationDataSource
import com.example.locationservice.data.repository.DefaultLocationRepository
import com.example.locationservice.data.repository.LocationRepository
import com.example.locationservice.data.service.KtorLocationApi
import com.example.locationservice.data.service.LocationApi
import com.example.locationservice.db.AppDataBase
import com.example.locationservice.db.LocationDao
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.gson.gson
import org.koin.dsl.module

val dataLocationModule = module {
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
        Room.databaseBuilder(get(), AppDataBase::class.java, "locations-db")
            .fallbackToDestructiveMigration(false)
            .build()
    }

    single <LocationDao>{ get<AppDataBase>().locationDao() }

    single<LocationApi> { KtorLocationApi(get()) }
    single<LocationDataSource> { RemoteLocationDataSource(get(), get()) }
    single<LocationRepository> { DefaultLocationRepository(get()) }
}