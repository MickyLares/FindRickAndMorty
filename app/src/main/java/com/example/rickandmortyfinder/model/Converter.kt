package com.example.rickandmortyfinder.model

import androidx.room.TypeConverter

class Converter {

    @TypeConverter
    fun fromList(list: List<Int>): String {
        return list.joinToString(separator = ",")
    }

    @TypeConverter
    fun toList(data: String): List<Int> {
        return if (data.isEmpty()) {
            emptyList()
        } else {
            data.split(",").map { it.toInt() }
        }
    }
}