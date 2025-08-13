package com.example.locationservice.data.dataSource.implementation

import com.example.locationservice.data.dataSource.interfaces.LocationDataSource
import com.example.locationservice.data.service.LocationApi
import com.example.locationservice.data.model.Location
import com.example.locationservice.db.LocationDao

class RemoteLocationDataSource(
    private val locationApi: LocationApi,
    private val locationDao: LocationDao
): LocationDataSource {

    override suspend fun fetchLocations(): List<Location> {
        val locationsRemote = locationApi.fetchListLocations()
        saveLocation(locationsRemote)
        return locationDao.getAllLocations()
    }

    override suspend fun saveLocation(locations: List<Location>) {
        locationDao.saveLocation(locations)
    }

    override suspend fun getLocationById(id: Int): Location? {
        return locationDao.getLocationByid(id)
    }
}