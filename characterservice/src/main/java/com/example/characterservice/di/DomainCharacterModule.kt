package com.example.characterservice.di

import com.example.characterservice.domain.useCase.DefaultGetCharacterByIdUseCase
import com.example.characterservice.domain.useCase.DefaultGetCharacterUseCase
import com.example.characterservice.domain.useCase.GetCharacterByIdUseCase
import com.example.characterservice.domain.useCase.GetCharacterUseCase
import com.example.characterservice.utils.CharacterMappers
import com.example.characterservice.utils.DefaultCharacterListMapper
import org.koin.dsl.module

val domainCharacterModule = module {
    factory<CharacterMappers> { DefaultCharacterListMapper() }
    factory<GetCharacterUseCase> { DefaultGetCharacterUseCase(get(), get()) }
    factory <GetCharacterByIdUseCase> { DefaultGetCharacterByIdUseCase(get(), get()) }
}