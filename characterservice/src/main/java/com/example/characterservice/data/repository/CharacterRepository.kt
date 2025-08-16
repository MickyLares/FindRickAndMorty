package com.example.characterservice.data.repository
import com.example.characterservice.data.dataSource.implementation.RemoteCharacterDataSource
import com.example.characterservice.data.dataSource.interfaces.CharacterDataSource
import com.example.characterservice.data.model.Character
interface CharacterRepository{
    suspend fun init()
    suspend fun getCharacterList(): List<Character>
    suspend fun getCharacterById(id:Int): Character?
}

class DefaultCharacterRepository(
    private val remoteCharacterDataSource: CharacterDataSource
):CharacterRepository{
    override suspend fun init() {
        refresh()
    }

    override suspend fun getCharacterList(): List<Character> {
        return remoteCharacterDataSource.fetchCharacter()
    }

    override suspend fun getCharacterById(id: Int): Character? {
        return remoteCharacterDataSource.getCharacterById(id)
    }
    private suspend fun refresh(){
        remoteCharacterDataSource.fetchCharacter()
    }

}