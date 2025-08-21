package com.example.locationservice.data.repository

import com.example.locationservice.data.dataSource.interfaces.LocationDataSource
import com.example.locationservice.data.model.Location
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface LocationRepository {
    suspend fun init()
    fun getLocationList(): Flow<List<Location>>
    fun getLocationById(id: Int): Flow<Location?>
}

class DefaultLocationRepository(
    private val remoteLocationDataSource: LocationDataSource.Remote,
    private val localLocationDataSource: LocationDataSource.Local
) : LocationRepository {
    override suspend fun init() {
        refresh()
    }

    override fun getLocationList(): Flow<List<Location>> {
        return localLocationDataSource.getAllLocationFlow()
    }

    override  fun getLocationById(id: Int): Flow<Location?> {
        return localLocationDataSource.getLocationById(id)
    }

    private suspend fun refresh() {
        localLocationDataSource.saveLocation(remoteLocationDataSource.fetchLocations())
    }

}