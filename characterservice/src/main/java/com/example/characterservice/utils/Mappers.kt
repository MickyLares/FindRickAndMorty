package com.example.characterservice.utils

import com.example.characterservice.domain.model.CharacterDomain
import com.example.characterservice.data.model.Character
import com.example.characterservice.data.model.Location
import com.example.characterservice.data.model.Origin
import com.example.characterservice.domain.model.LocationDomain
import com.example.characterservice.domain.model.OriginDomain

interface CharacterMappers {
    fun map(data: List<Character>): List<CharacterDomain>
    fun map(data: Character): CharacterDomain
}

class DefaultCharacterListMapper : CharacterMappers {
    override fun map(data: List<Character>): List<CharacterDomain> {
        return data.map { map(it) }
    }

    override fun map(data: Character): CharacterDomain {
        return CharacterDomain(
            created = data.created,
            episode = data.episode,
            gender = data.gender,
            id = data.id,
            image = data.image,
            location = data.location?.toLocationDomain(),
            name = data.name,
            origin = data.origin?.toOriginDomain(),
            species = data.species,
            status = data.status,
            type = data.type,
            url = data.url
        )
    }

}

fun Location.toLocationDomain() = LocationDomain(
    name = this.name,
    url = this.url
)

fun Origin.toOriginDomain() = OriginDomain(
    name = this.name,
    url = this.url
)

