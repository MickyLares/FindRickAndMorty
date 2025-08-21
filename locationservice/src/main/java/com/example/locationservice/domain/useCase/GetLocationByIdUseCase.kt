package com.example.locationservice.domain.useCase

import com.example.locationservice.data.repository.LocationRepository
import com.example.locationservice.domain.model.LocationDomain
import com.example.locationservice.utils.LocationMappers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

interface GetLocationByIdUseCase {
    suspend fun execute(id: Int): Flow<LocationDomain>?
}

class DefaultGetLocationByIdUseCase(
    private val repository: LocationRepository,
    private val mappers: LocationMappers

) : GetLocationByIdUseCase {
    override suspend fun execute(id: Int): Flow<LocationDomain>? {
        return repository.getLocationById(id).map { mappers.map(it!!) }
    }
}
