package com.example.characterservice.data.model

import android.webkit.WebStorage
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.characterservice.utils.LocationConverter
import com.example.characterservice.utils.OriginConverter
import com.example.characterservice.utils.StringListConverter
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "characters")
@TypeConverters(LocationConverter::class, OriginConverter::class, StringListConverter::class)
data class Character(
    @SerialName("created")
    val created: String = "",
    @SerialName("episode")
    val episode: List<String> = emptyList(),
    @SerialName("gender")
    val gender: String = "",
    @SerialName("id")
    @PrimaryKey val id: Int = 0,
    @SerialName("image")
    val image: String = "",
    @SerialName("location")
    val location: Location = Location("", ""),
    @SerialName("name")
    val name: String = "",
    @SerialName("origin")
    val origin: Origin = Origin("", ""),
    @SerialName("species")
    val species: String = "",
    @SerialName("status")
    val status: String = "",
    @SerialName("type")
    val type: String = "",
    @SerialName("url")
    val url: String = ""
)
