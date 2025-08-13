package com.example.locationservice.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.locationservice.data.model.Location

@Database(entities = [Location::class], version = 1, exportSchema = false)
abstract class AppDataBase: RoomDatabase() {
    abstract fun locationDao(): LocationDao
}