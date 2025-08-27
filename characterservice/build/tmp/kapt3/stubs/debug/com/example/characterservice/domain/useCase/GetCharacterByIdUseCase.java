package com.example.characterservice.domain.useCase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/characterservice/domain/useCase/GetCharacterByIdUseCase;", "", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/characterservice/domain/model/CharacterDomain;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "characterservice_debug"})
public abstract interface GetCharacterByIdUseCase {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object execute(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.characterservice.domain.model.CharacterDomain>> $completion);
}