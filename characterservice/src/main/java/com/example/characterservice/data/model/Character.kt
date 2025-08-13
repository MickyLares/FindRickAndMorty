package com.example.characterservice.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "characters")
data class Character(
    @SerialName("created")
    val created: String?,
    @SerialName("episode")
    val episode: List<String?>?,
    @SerialName("gender")
    val gender: String?,
    @SerialName("id")
    @PrimaryKey val id: Int = 0,
    @SerialName("image")
    val image: String?,
    @SerialName("location")
    val location: Location?,
    @SerialName("name")
    val name: String?,
    @SerialName("origin")
    val origin: Origin?,
    @SerialName("species")
    val species: String?,
    @SerialName("status")
    val status: String?,
    @SerialName("type")
    val type: String?,
    @SerialName("url")
    val url: String?
)
