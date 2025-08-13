package com.example.locationservice.data.model

import kotlinx.serialization.SerialName

data class ApiResponseLocation(
    @SerialName("info")
    val info: Info?,
    @SerialName("results")
    val results: List<Location>
)