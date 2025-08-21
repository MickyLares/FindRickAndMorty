package com.example.locationservice.domain.useCase

import com.example.locationservice.data.repository.LocationRepository
import com.example.locationservice.domain.model.LocationDomain
import com.example.locationservice.utils.LocationMappers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

interface GetLocationsUseCase {
    fun execute(): Flow<List<LocationDomain>>
}

class DefaultGetLocationsUseCase(
    private val repository: LocationRepository,
    private val mappers: LocationMappers
) : GetLocationsUseCase {
    override fun execute(): Flow<List<LocationDomain>> {
        return repository.getLocationList().map { list -> list.map { mappers.map(it) } }
    }
}