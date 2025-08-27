package com.example.rickandmortyfinder.presentation.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/example/rickandmortyfinder/presentation/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getCharacterUseCase", "Lcom/example/characterservice/domain/useCase/GetCharacterUseCase;", "preferenceRepository", "Lcom/example/rickandmortyfinder/data/PreferenceRepository;", "(Lcom/example/characterservice/domain/useCase/GetCharacterUseCase;Lcom/example/rickandmortyfinder/data/PreferenceRepository;)V", "_characters", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/characterservice/domain/model/CharacterDomain;", "_showOnBoarding", "", "characters", "Lkotlinx/coroutines/flow/StateFlow;", "getCharacters", "()Lkotlinx/coroutines/flow/StateFlow;", "showOnBoarding", "getShowOnBoarding", "getPreferences", "", "onBoardingFinished", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.domain.useCase.GetCharacterUseCase getCharacterUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.rickandmortyfinder.data.PreferenceRepository preferenceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.characterservice.domain.model.CharacterDomain>> _characters = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _showOnBoarding = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showOnBoarding = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.characterservice.domain.model.CharacterDomain>> characters = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.domain.useCase.GetCharacterUseCase getCharacterUseCase, @org.jetbrains.annotations.NotNull()
    com.example.rickandmortyfinder.data.PreferenceRepository preferenceRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowOnBoarding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.characterservice.domain.model.CharacterDomain>> getCharacters() {
        return null;
    }
    
    private final void getPreferences() {
    }
    
    public final void onBoardingFinished() {
    }
}