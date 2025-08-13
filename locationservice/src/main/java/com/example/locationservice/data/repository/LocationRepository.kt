package com.example.locationservice.data.repository

import com.example.locationservice.data.dataSource.interfaces.LocationDataSource
import com.example.locationservice.data.model.Location

interface LocationRepository {
    suspend fun init()
    suspend fun getLocationList(): List<Location>
    suspend fun getLocationById(id:Int): Location?
}

class DefaultLocationRepository(
    private val remoteLocationDataSource: LocationDataSource
):LocationRepository{
    override suspend fun init() {
        refresh()
    }

    override suspend fun getLocationList(): List<Location> {
        return remoteLocationDataSource.fetchLocations()
    }

    override suspend fun getLocationById(id: Int): Location? {
        return remoteLocationDataSource.getLocationById(id)
    }
    private suspend fun refresh(){
        remoteLocationDataSource.fetchLocations()
    }

}