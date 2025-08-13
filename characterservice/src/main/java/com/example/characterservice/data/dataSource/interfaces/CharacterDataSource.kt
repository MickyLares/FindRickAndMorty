package com.example.characterservice.data.dataSource.interfaces
import com.example.characterservice.data.model.Character
interface CharacterDataSource {
    suspend fun fetchCharacter(): List<Character>
    suspend fun saveCharacter(chacters: List<Character>)
    suspend fun getCharacterById(id:Int): Character?
}