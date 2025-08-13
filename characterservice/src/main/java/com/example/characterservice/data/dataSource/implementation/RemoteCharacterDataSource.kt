package com.example.characterservice.data.dataSource.implementation

import com.example.characterservice.data.dataSource.interfaces.CharacterDataSource
import com.example.characterservice.data.service.CharacterApi
import com.example.characterservice.db.CharacterDao
import com.example.characterservice.data.model.Character

class RemoteCharacterDataSource (
    private val characterApi: CharacterApi,
    private val characterDao: CharacterDao
): CharacterDataSource {
    override suspend fun fetchCharacter(): List<Character> {
        val charactersRemote = characterApi.fetchListCharacter()
        saveCharacter(charactersRemote)
        return characterDao.getAllCharacters()
    }

    override suspend fun saveCharacter(chacters: List<Character>) {
        characterDao.saveCharacters(chacters)
    }

    override suspend fun getCharacterById(id: Int): Character? {
        return characterDao.getCharacterById(id)
    }

}