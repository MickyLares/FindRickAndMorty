package com.example.characterservice.utils

import androidx.room.TypeConverter
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
class LocationConverter {

    @TypeConverter
    fun fromLocation(location: Location?): String {
        return if (location == null) {
            ""
        } else {
            "${location.name?.replace(",", "\\,")}|${location.url?.replace(",", "\\,")}"
        }
    }

    @TypeConverter
    fun toLocation(data: String): Location? {
        return if (data.isEmpty()) {
            null
        } else {
            val parts = data.split("|").map { it.replace("\\,", ",") }
            when {
                parts.size != 2 -> null
                parts[0].isEmpty() && parts[1].isEmpty() -> null
                else -> Location(
                    name = parts[0].ifEmpty { null },
                    url = parts[1].ifEmpty { null }
                )
            }
        }
    }
}

class OriginConverter {
    @TypeConverter
    fun fromOrigin(origin: Origin): String {
        return "${origin.name}|${origin.url}"
    }

    @TypeConverter
    fun toOrigin(data: String): Origin {
        val parts = data.split("|")
        return Origin(
            name = parts.getOrElse(0) { "" },
            url = parts.getOrElse(1) { "" }
        )
    }
}
