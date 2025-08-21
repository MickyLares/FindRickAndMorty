package com.example.locationservice.data.dataSource.interfaces

import com.example.locationservice.data.model.Location
import kotlinx.coroutines.flow.Flow

interface LocationDataSource {
    interface Remote {
        suspend fun fetchLocations(): List<Location>
    }

    interface Local {
        suspend fun saveLocation(locations: List<Location>)
        fun getLocationById(id: Int): Flow<Location?>

        fun getAllLocationFlow(): Flow<List<Location>>
    }


}