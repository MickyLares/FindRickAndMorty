package com.example.characterservice.domain.useCase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/characterservice/domain/useCase/DefaultGetCharacterUseCase;", "Lcom/example/characterservice/domain/useCase/GetCharacterUseCase;", "repository", "Lcom/example/characterservice/data/repository/CharacterRepository;", "mappers", "Lcom/example/characterservice/utils/CharacterMappers;", "(Lcom/example/characterservice/data/repository/CharacterRepository;Lcom/example/characterservice/utils/CharacterMappers;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/characterservice/domain/model/CharacterDomain;", "characterservice_debug"})
public final class DefaultGetCharacterUseCase implements com.example.characterservice.domain.useCase.GetCharacterUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.data.repository.CharacterRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.utils.CharacterMappers mappers = null;
    
    public DefaultGetCharacterUseCase(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.repository.CharacterRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.characterservice.utils.CharacterMappers mappers) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.characterservice.domain.model.CharacterDomain>> execute() {
        return null;
    }
}