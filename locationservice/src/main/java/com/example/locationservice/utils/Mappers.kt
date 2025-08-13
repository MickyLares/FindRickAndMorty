package com.example.locationservice.utils

import com.example.locationservice.data.model.Location
import com.example.locationservice.domain.model.LocationDomain

interface LocationMappers {
    fun map(data: List<Location>): List<LocationDomain>
    fun map(data: Location): LocationDomain
}

class DefaultLocationListMappers: LocationMappers{
    override fun map(data: List<Location>): List<LocationDomain> {
        return data.map { map(it) }
    }

    override fun map(data: Location): LocationDomain {
        return LocationDomain(
            created = data.created,
            dimension = data.dimension,
            id = data.id,
            name = data.name,
            residents = data.residents,
            type = data.type,
            url = data.url
        )
    }

}