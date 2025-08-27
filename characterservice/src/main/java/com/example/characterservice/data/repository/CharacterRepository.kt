package com.example.characterservice.data.repository
import android.util.Log
import com.example.characterservice.data.dataSource.implementation.RemoteCharacterDataSource
import com.example.characterservice.data.dataSource.interfaces.CharacterDataSource
import com.example.characterservice.data.model.Character
import com.example.characterservice.db.CharacterDao
import kotlinx.coroutines.flow.Flow
import org.w3c.dom.CharacterData

interface CharacterRepository{
    suspend fun init()
    fun getCharacterList(): Flow<List<Character>>
    fun getCharacterById(id:Int): Flow<Character?>

    suspend fun updateCharacter(character: Character)
}

class DefaultCharacterRepository(
    private val remoteCharacterDataSource: CharacterDataSource.Remote,
    private val localCharacterDataSource: CharacterDataSource.Local
):CharacterRepository{
    override suspend fun init() {
        refresh()
    }

    override fun getCharacterList(): Flow<List<Character>> {
        return localCharacterDataSource.getAllCharactersFlow()
    }

    override fun getCharacterById(id: Int): Flow<Character?> {
        return localCharacterDataSource.getCharacterByIdFlow(id)
    }

    override suspend fun updateCharacter(character: Character) {
        localCharacterDataSource.updateCharacter(character)
    }

    private suspend fun refresh(){
        val remoteCharacters = remoteCharacterDataSource.fetchCharacter()
        Log.d("testDB", "${remoteCharacters.toString()} ")
        localCharacterDataSource.saveCharacter(remoteCharacters)
    }

}