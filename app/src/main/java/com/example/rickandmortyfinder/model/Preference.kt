package com.example.rickandmortyfinder.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "preference")
data class Preference(
    @PrimaryKey
    val id: Int = 0,
    val showOnBoarding: Boolean,
    val charactersDeleted: List<Int>
    )