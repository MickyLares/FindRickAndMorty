package com.example.characterservice.domain.useCase

import com.example.characterservice.data.repository.CharacterRepository
import com.example.characterservice.domain.model.CharacterDomain
import com.example.characterservice.utils.CharacterMappers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

interface GetCharacterByIdUseCase {
    suspend fun execute(id: Int): Flow<CharacterDomain>?
}

class DefaultGetCharacterByIdUseCase(
    private val repository: CharacterRepository,
    private val mappers: CharacterMappers
): GetCharacterByIdUseCase{
    override suspend fun execute(id: Int): Flow<CharacterDomain>? {
        return repository.getCharacterById(id).map { mappers.map(it!!) }

    }

}