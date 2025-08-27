package com.example.characterservice.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.characterservice.data.model.Character
import com.example.characterservice.utils.LocationConverter
import com.example.characterservice.utils.StringListConverter

@Database(entities = [Character::class], version = 2, exportSchema = false)
@TypeConverters(StringListConverter::class)
abstract class AppDataBase: RoomDatabase() {
    abstract fun characterDao(): CharacterDao
}