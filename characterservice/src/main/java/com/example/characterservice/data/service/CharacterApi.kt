package com.example.characterservice.data.service

import com.example.characterservice.data.model.ApiResponseCharacter
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import com.example.characterservice.data.model.Character

interface CharacterApi{
    suspend fun fetchListCharacter(): List<Character>
}

class KtorCharacterApi(
    private val client: HttpClient
):CharacterApi{
    companion object{
        private const val BASE_URL = "https://rickandmortyapi.com/api/character"
    }
    override suspend fun fetchListCharacter(): List<Character> {
        return try {
            client.get(BASE_URL).body<ApiResponseCharacter>().results
        }catch (error: Exception){
            emptyList()
        }
    }

}