package com.example.locationservice.data.dataSource.interfaces

import com.example.locationservice.data.model.Location

interface LocationDataSource {
    suspend fun fetchLocations(): List<Location>
    suspend fun saveLocation(locations:List<Location>)
    suspend fun getLocationById(id:Int): Location?
}