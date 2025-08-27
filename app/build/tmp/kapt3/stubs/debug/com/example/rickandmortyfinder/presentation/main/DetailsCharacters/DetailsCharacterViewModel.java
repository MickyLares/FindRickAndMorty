package com.example.rickandmortyfinder.presentation.main.DetailsCharacters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/rickandmortyfinder/presentation/main/DetailsCharacters/DetailsCharacterViewModel;", "Landroidx/lifecycle/ViewModel;", "getCharacterByIdUseCase", "Lcom/example/characterservice/domain/useCase/GetCharacterByIdUseCase;", "characterRepository", "Lcom/example/characterservice/data/repository/CharacterRepository;", "(Lcom/example/characterservice/domain/useCase/GetCharacterByIdUseCase;Lcom/example/characterservice/data/repository/CharacterRepository;)V", "character", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/characterservice/domain/model/CharacterDomain;", "getCharacter$annotations", "()V", "getCharacter", "()Lkotlinx/coroutines/flow/StateFlow;", "characterId", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "setId", "", "id", "updateDBCharacter", "Lkotlinx/coroutines/Job;", "status", "", "app_debug"})
public final class DetailsCharacterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.domain.useCase.GetCharacterByIdUseCase getCharacterByIdUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.data.repository.CharacterRepository characterRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> characterId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.characterservice.domain.model.CharacterDomain> character = null;
    
    public DetailsCharacterViewModel(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.domain.useCase.GetCharacterByIdUseCase getCharacterByIdUseCase, @org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.repository.CharacterRepository characterRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.characterservice.domain.model.CharacterDomain> getCharacter() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated()
    public static void getCharacter$annotations() {
    }
    
    public final void setId(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateDBCharacter(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        return null;
    }
}