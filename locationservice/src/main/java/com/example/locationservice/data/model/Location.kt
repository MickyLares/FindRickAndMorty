package com.example.locationservice.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "locations")
data class Location(
    @SerialName("created")
    val created: String = "",
    @SerialName("dimension")
    val dimension: String = "",
    @SerialName("id")
    @PrimaryKey val id: Int = 0,
    @SerialName("name")
    val name: String = "",
    @SerialName("residents")
    val residents: List<String> = emptyList(),
    @SerialName("type")
    val type: String = "",
    @SerialName("url")
    val url: String = ""
)