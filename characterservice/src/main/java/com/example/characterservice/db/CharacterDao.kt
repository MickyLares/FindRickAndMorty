package com.example.characterservice.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.characterservice.data.model.Character
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveCharacters(characters:List<Character>)
    @Query("SELECT * FROM characters")
    fun getAllCharacters(): Flow<List<Character>>
    @Query("SELECT * FROM characters WHERE id == :id LIMIT 1")
    fun getCharacterById(id:Int): Flow<Character?>

    @Update
    suspend fun updateCharacter(character: Character)
}