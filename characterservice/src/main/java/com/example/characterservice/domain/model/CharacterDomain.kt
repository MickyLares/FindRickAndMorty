package com.example.characterservice.domain.model

data class CharacterDomain(
    val created: String = "",
    val episode: List<String> = emptyList(),
    val gender: String = "",
    val id: Int = 0,
    val image: String = "",
    val location: LocationDomain?,
    val name: String = "",
    val origin: OriginDomain?,
    val species: String = "",
    val status: String = "",
    val type: String = "",
    val url: String = ""
)