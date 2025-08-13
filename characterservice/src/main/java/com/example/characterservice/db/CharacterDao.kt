package com.example.characterservice.db

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.characterservice.data.model.Character
interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveCharacters(characters:List<Character>)
    @Query("SELECT * FROM characters")
    suspend fun getAllCharacters():List<Character>
    @Query("SELECT * FROM characters WHERE id == :id LIMIT 1")
    suspend fun getCharacterById(id:Int): Character?

}