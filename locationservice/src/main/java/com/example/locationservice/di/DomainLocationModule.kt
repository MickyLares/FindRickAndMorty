package com.example.locationservice.di

import com.example.locationservice.domain.useCase.DefaultGetLocationByIdUseCase
import com.example.locationservice.domain.useCase.DefaultGetLocationsUseCase
import com.example.locationservice.domain.useCase.GetLocationByIdUseCase
import com.example.locationservice.domain.useCase.GetLocationsUseCase
import com.example.locationservice.utils.DefaultLocationListMappers
import com.example.locationservice.utils.LocationMappers
import org.koin.dsl.module

val domainLocationModule = module{
    factory <LocationMappers>{ DefaultLocationListMappers() }
    factory <GetLocationsUseCase>{ DefaultGetLocationsUseCase(get(), get()) }
    factory <GetLocationByIdUseCase>{ DefaultGetLocationByIdUseCase(get(), get()) }
}