package com.example.characterservice.data.dataSource.implementation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/characterservice/data/dataSource/implementation/RemoteCharacterDataSource;", "Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource$Remote;", "characterApi", "Lcom/example/characterservice/data/service/CharacterApi;", "(Lcom/example/characterservice/data/service/CharacterApi;)V", "fetchCharacter", "", "Lcom/example/characterservice/data/model/Character;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "characterservice_debug"})
public final class RemoteCharacterDataSource implements com.example.characterservice.data.dataSource.interfaces.CharacterDataSource.Remote {
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.data.service.CharacterApi characterApi = null;
    
    public RemoteCharacterDataSource(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.service.CharacterApi characterApi) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchCharacter(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.characterservice.data.model.Character>> $completion) {
        return null;
    }
}