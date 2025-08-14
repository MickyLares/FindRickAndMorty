package com.example.rickandmortyfinder.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.rickandmortyfinder.model.Preference

@Dao
interface PreferenceDao {

    @Query("SELECT * FROM preference WHERE id = :id")
    suspend fun getPreference(id: Int = 0): Preference?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPreference(preference: Preference)

    @Update
    suspend fun updatePreference(preference: Preference)

    @Delete
    suspend fun deletePreference(preference: Preference)
}