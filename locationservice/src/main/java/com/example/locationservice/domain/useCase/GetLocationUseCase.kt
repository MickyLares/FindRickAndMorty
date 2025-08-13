package com.example.locationservice.domain.useCase

import com.example.locationservice.data.repository.LocationRepository
import com.example.locationservice.domain.model.LocationDomain
import com.example.locationservice.utils.LocationMappers

interface GetLocationsUseCase {
    suspend fun execute(): List<LocationDomain>
}

class DefaultGetLocationsUseCase(
    private val repository: LocationRepository,
    private val mappers: LocationMappers
):GetLocationsUseCase{
    override suspend fun execute(): List<LocationDomain> {
        return repository.getLocationList().map { mappers.map(it) }
    }

}