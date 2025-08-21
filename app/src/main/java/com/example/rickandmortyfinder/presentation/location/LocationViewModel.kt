package com.example.rickandmortyfinder.presentation.location

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.locationservice.data.repository.LocationRepository
import com.example.locationservice.domain.model.LocationDomain
import com.example.locationservice.domain.useCase.GetLocationsUseCase
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class LocationViewModel(
    getLocationsUseCase: GetLocationsUseCase,
    locationRepository: LocationRepository
): ViewModel() {
    val locations : StateFlow<List<LocationDomain>> = getLocationsUseCase.execute()
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            emptyList()
        )

    init {
        viewModelScope.launch {
            locationRepository.init()
        }
    }
}