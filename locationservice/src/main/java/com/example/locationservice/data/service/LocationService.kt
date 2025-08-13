package com.example.locationservice.data.service

import com.example.locationservice.data.model.ApiResponseLocation
import com.example.locationservice.data.model.Location
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

interface LocationApi {
    suspend fun fetchListLocations(): List<Location>
}

class KtorLocationApi(
    private val client: HttpClient
) : LocationApi {
    companion object {
        private const val BASE_URL = "https://rickandmortyapi.com/api/location"
    }

    override suspend fun fetchListLocations(): List<Location> {
        return try {
            client.get(BASE_URL).body<ApiResponseLocation>().results

        } catch (error: Exception) {
            emptyList()
        }
    }

}