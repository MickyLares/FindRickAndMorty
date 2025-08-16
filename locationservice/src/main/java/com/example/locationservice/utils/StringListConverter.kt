package com.example.locationservice.utils

import androidx.room.TypeConverter

class StringListConverter {

    @TypeConverter
    fun fromStringList(list: List<String>): String {
        return list.joinToString(separator = ",")
    }

    @TypeConverter
    fun toStringList(data: String): List<String> {
        return if (data.isEmpty()) {
            emptyList()
        } else {
            data.split(",").map { it.trim() }
        }
    }
}