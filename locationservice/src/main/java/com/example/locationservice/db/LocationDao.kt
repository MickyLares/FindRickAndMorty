package com.example.locationservice.db

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.locationservice.data.model.Location

interface LocationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveLocation(locations: List<Location>)
    @Query("SELECT * FROM locations")
    suspend fun getAllLocations(): List<Location>
    @Query("SELECT * FROM locations WHERE id == :id LIMIT 1")
    suspend fun getLocationByid(id: Int): Location?
}