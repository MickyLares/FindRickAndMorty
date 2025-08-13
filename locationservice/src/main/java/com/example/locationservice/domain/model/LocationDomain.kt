package com.example.locationservice.domain.model

class LocationDomain(
    val created: String?,
    val dimension: String?,
    val id: Int = 0,
    val name: String?,
    val residents: List<String?>?,
    val type: String?,
    val url: String?
)