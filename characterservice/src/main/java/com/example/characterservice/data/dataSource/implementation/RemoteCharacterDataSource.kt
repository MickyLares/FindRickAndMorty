package com.example.characterservice.data.dataSource.implementation

import com.example.characterservice.data.dataSource.interfaces.CharacterDataSource
import com.example.characterservice.data.service.CharacterApi
import com.example.characterservice.db.CharacterDao
import com.example.characterservice.data.model.Character
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RemoteCharacterDataSource (
    private val characterApi: CharacterApi,
): CharacterDataSource.Remote {
    override suspend fun fetchCharacter(): List<Character> {
       return characterApi.fetchListCharacter()

    }

}

class LocalCharacterDataSource(private val characterDao: CharacterDao): CharacterDataSource.Local{
    override suspend fun saveCharacter(chacters: List<Character>) {
        characterDao.saveCharacters(chacters)
    }



    override suspend fun updateCharacter(character: Character) {
        characterDao.updateCharacter(character)
    }

    override fun getAllCharactersFlow(): Flow<List<Character>> {
        return characterDao.getAllCharacters()
    }

    override fun getCharacterByIdFlow(id: Int): Flow<Character?> {
        return characterDao.getCharacterById(id)
    }

}