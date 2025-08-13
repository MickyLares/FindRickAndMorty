package com.example.locationservice.domain.useCase

import com.example.locationservice.data.repository.LocationRepository
import com.example.locationservice.domain.model.LocationDomain
import com.example.locationservice.utils.LocationMappers

interface GetLocationByIdUseCase {
    suspend fun execute(id: Int): LocationDomain?
}

class DefaultGetLocationByIdUseCase(
    private val repository: LocationRepository,
    private val mappers: LocationMappers

) : GetLocationByIdUseCase {
    override suspend fun execute(id: Int): LocationDomain? {
        return repository.getLocationById(id)?.let { mappers.map(it) }
    }
}
