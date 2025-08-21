package com.example.locationservice.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.locationservice.data.model.Location
import kotlinx.coroutines.flow.Flow

@Dao
interface LocationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveLocation(locations: List<Location>)
    @Query("SELECT * FROM locations")
    fun getAllLocations(): Flow<List<Location>>
    @Query("SELECT * FROM locations WHERE id == :id LIMIT 1")
    fun getLocationByid(id: Int): Flow<Location?>
}