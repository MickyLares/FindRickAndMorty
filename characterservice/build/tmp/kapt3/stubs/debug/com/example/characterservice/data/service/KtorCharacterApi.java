package com.example.characterservice.data.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/characterservice/data/service/KtorCharacterApi;", "Lcom/example/characterservice/data/service/CharacterApi;", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "fetchListCharacter", "", "Lcom/example/characterservice/data/model/Character;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "characterservice_debug"})
public final class KtorCharacterApi implements com.example.characterservice.data.service.CharacterApi {
    @org.jetbrains.annotations.NotNull()
    private final io.ktor.client.HttpClient client = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://rickandmortyapi.com/api/character";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.characterservice.data.service.KtorCharacterApi.Companion Companion = null;
    
    public KtorCharacterApi(@org.jetbrains.annotations.NotNull()
    io.ktor.client.HttpClient client) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchListCharacter(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.characterservice.data.model.Character>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/characterservice/data/service/KtorCharacterApi$Companion;", "", "()V", "BASE_URL", "", "characterservice_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}