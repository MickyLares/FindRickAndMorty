package com.example.locationservice.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.locationservice.data.model.Location
import com.example.locationservice.utils.StringListConverter

@Database(entities = [Location::class], version = 1, exportSchema = false)
@TypeConverters(StringListConverter::class)
abstract class AppDataBase: RoomDatabase() {
    abstract fun locationDao(): LocationDao
}