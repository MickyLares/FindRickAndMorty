package com.example.locationservice.data.dataSource.implementation

import com.example.locationservice.data.dataSource.interfaces.LocationDataSource
import com.example.locationservice.data.service.LocationApi
import com.example.locationservice.data.model.Location
import com.example.locationservice.db.LocationDao
import kotlinx.coroutines.flow.Flow

class RemoteLocationDataSource(
    private val locationApi: LocationApi,
): LocationDataSource.Remote {

    override suspend fun fetchLocations(): List<Location> {
         return locationApi.fetchListLocations()

    }
}

class LocalLocationDataSource(private val locationDao: LocationDao): LocationDataSource.Local{
    override suspend fun saveLocation(locations: List<Location>) {
        locationDao.saveLocation(locations)
    }



    override fun getAllLocationFlow(): Flow<List<Location>> {
        return locationDao.getAllLocations()
    }

    override  fun getLocationById(id: Int): Flow<Location?> {
        return locationDao.getLocationByid(id)
    }

}