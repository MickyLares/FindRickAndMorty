package com.example.rickandmortyfinder.presentation.main.DetailsCharacters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.characterservice.data.repository.CharacterRepository
import com.example.characterservice.domain.model.CharacterDomain
import com.example.characterservice.domain.model.LocationDomain
import com.example.characterservice.domain.model.OriginDomain
import com.example.characterservice.domain.useCase.GetCharacterByIdUseCase
import com.example.characterservice.utils.toCharacter
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class DetailsCharacterViewModel(
    private val getCharacterByIdUseCase: GetCharacterByIdUseCase,
    private val characterRepository: CharacterRepository
) : ViewModel() {

    private val characterId = MutableStateFlow<Int?>(null)

    @OptIn(ExperimentalCoroutinesApi::class)
    val character: StateFlow<CharacterDomain?> = characterId
        .flatMapLatest { id ->
            id?.let { getCharacterByIdUseCase.execute(it) } ?: flow {
                emit(
                    CharacterDomain(
                        location = LocationDomain("", ""),
                        origin = OriginDomain("", "")
                    )
                )
            }
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    fun setId(id: Int) {
        this.characterId.value = id
    }

    fun updateDBCharacter(status: String) = viewModelScope.launch {
        val characterUpdated = character.value?.copy(status = status)
        characterUpdated?.let {
            characterRepository.updateCharacter(it.toCharacter())
            setId(it.id)
        }
    }

}