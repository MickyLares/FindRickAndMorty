package com.example.characterservice.domain.useCase

import com.example.characterservice.data.repository.CharacterRepository
import com.example.characterservice.domain.model.CharacterDomain
import com.example.characterservice.utils.CharacterMappers

interface GetCharacterByIdUseCase {
    suspend fun execute(id: Int): CharacterDomain?
}

class DefaultGetCharacterByIdUseCase(
    private val repository: CharacterRepository,
    private val mappers: CharacterMappers
): GetCharacterByIdUseCase{
    override suspend fun execute(id: Int): CharacterDomain? {
        return repository.getCharacterById(id)?.let { mappers.map(it) }
    }

}