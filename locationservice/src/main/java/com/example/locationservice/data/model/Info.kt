package com.example.locationservice.data.model

import kotlinx.serialization.SerialName

data class Info(
    @SerialName("count")
    val count: Int?,
    @SerialName("next")
    val next: String?,
    @SerialName("pages")
    val pages: Int?,
    @SerialName("prev")
    val prev: Int?
)