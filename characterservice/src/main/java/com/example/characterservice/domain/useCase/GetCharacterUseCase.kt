package com.example.characterservice.domain.useCase

import com.example.characterservice.data.repository.CharacterRepository
import com.example.characterservice.domain.model.CharacterDomain
import com.example.characterservice.utils.CharacterMappers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

interface GetCharacterUseCase {
     fun execute(): Flow<List<CharacterDomain>>
}

class DefaultGetCharacterUseCase(
    private val repository: CharacterRepository,
    private val mappers: CharacterMappers
) : GetCharacterUseCase {
    override  fun execute(): Flow<List<CharacterDomain>> {
        return repository.getCharacterList().map { list -> list.map { mappers.map(it) } }
    }

}