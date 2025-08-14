package com.example.rickandmortyfinder.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.rickandmortyfinder.model.Converter
import com.example.rickandmortyfinder.model.Preference

@Database(entities = [Preference::class], version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class AppDataBase: RoomDatabase()  {
    abstract fun preferenceDao(): PreferenceDao

}