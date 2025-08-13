package com.example.characterservice.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponseCharacter(
    @SerialName("info")
    val info: Info?,
    @SerialName("results")
    val results: List<Character>
)