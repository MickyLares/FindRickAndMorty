package com.example.characterservice.domain.useCase

import com.example.characterservice.data.repository.CharacterRepository
import com.example.characterservice.domain.model.CharacterDomain
import com.example.characterservice.utils.CharacterMappers

interface GetCharacterUseCase {
    suspend fun execute(): List<CharacterDomain>
}

class DefaultGetCharacterUseCase(
    private val repository: CharacterRepository,
    private val mappers: CharacterMappers
) : GetCharacterUseCase {
    override suspend fun execute(): List<CharacterDomain> {
        return repository.getCharacterList().map { mappers.map(it) }
    }

}