package com.example.characterservice.domain.useCase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/characterservice/domain/useCase/DefaultGetCharacterByIdUseCase;", "Lcom/example/characterservice/domain/useCase/GetCharacterByIdUseCase;", "repository", "Lcom/example/characterservice/data/repository/CharacterRepository;", "mappers", "Lcom/example/characterservice/utils/CharacterMappers;", "(Lcom/example/characterservice/data/repository/CharacterRepository;Lcom/example/characterservice/utils/CharacterMappers;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/characterservice/domain/model/CharacterDomain;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "characterservice_debug"})
public final class DefaultGetCharacterByIdUseCase implements com.example.characterservice.domain.useCase.GetCharacterByIdUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.data.repository.CharacterRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.utils.CharacterMappers mappers = null;
    
    public DefaultGetCharacterByIdUseCase(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.repository.CharacterRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.characterservice.utils.CharacterMappers mappers) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object execute(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.characterservice.domain.model.CharacterDomain>> $completion) {
        return null;
    }
}