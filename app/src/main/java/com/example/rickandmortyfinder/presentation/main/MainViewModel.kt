package com.example.rickandmortyfinder.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.characterservice.domain.model.CharacterDomain
import com.example.characterservice.domain.useCase.GetCharacterUseCase
import com.example.rickandmortyfinder.data.PreferenceRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MainViewModel(
    getCharacterUseCase: GetCharacterUseCase,
    private val preferenceRepository: PreferenceRepository
) : ViewModel() {
    private val _showOnBoarding = MutableStateFlow<Boolean>(true)
    val showOnBoarding: StateFlow<Boolean> = _showOnBoarding

    val characters: StateFlow<List<CharacterDomain>> = getCharacterUseCase.execute()
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            emptyList()
        )

    init {
        getPreferences()
    }

    private fun getPreferences() {
        viewModelScope.launch {
            val pref = preferenceRepository.getPreference()
            _showOnBoarding.value = pref.showOnBoarding
        }
    }

    fun onBoardingFinished() {
        viewModelScope.launch {
            preferenceRepository.disableOnBoarding()
            _showOnBoarding.value = false
        }
    }

}