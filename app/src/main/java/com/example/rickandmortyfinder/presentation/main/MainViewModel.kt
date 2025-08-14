package com.example.rickandmortyfinder.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.characterservice.domain.model.CharacterDomain
import com.example.characterservice.domain.useCase.GetCharacterUseCase
import com.example.rickandmortyfinder.db.PreferenceDao
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MainViewModel (
    private val getCharacterUseCase: GetCharacterUseCase,
    private val preferenceDao: PreferenceDao
): ViewModel(){
    private val _characters = MutableStateFlow<List<CharacterDomain>>(emptyList())
    val characters: StateFlow<List<CharacterDomain>> = _characters
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            emptyList()
        )

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            _characters.value = getCharacterUseCase.execute()
        }
    }
}