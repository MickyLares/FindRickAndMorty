package com.example.characterservice.data.dataSource.interfaces
import com.example.characterservice.data.model.Character
import kotlinx.coroutines.flow.Flow

interface CharacterDataSource {
    interface Remote{
        suspend fun fetchCharacter(): List<Character>
    }
    interface Local{
        suspend fun saveCharacter(chacters: List<Character>)
        suspend fun updateCharacter(character: Character)

        fun getAllCharactersFlow(): Flow<List<Character>>
        fun getCharacterByIdFlow(id: Int): Flow<Character?>
    }
}