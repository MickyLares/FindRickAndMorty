package com.example.characterservice.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\bH\u0016J\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/characterservice/data/repository/DefaultCharacterRepository;", "Lcom/example/characterservice/data/repository/CharacterRepository;", "remoteCharacterDataSource", "Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource$Remote;", "localCharacterDataSource", "Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource$Local;", "(Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource$Remote;Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource$Local;)V", "getCharacterById", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/characterservice/data/model/Character;", "id", "", "getCharacterList", "", "init", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "updateCharacter", "character", "(Lcom/example/characterservice/data/model/Character;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "characterservice_debug"})
public final class DefaultCharacterRepository implements com.example.characterservice.data.repository.CharacterRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.data.dataSource.interfaces.CharacterDataSource.Remote remoteCharacterDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.data.dataSource.interfaces.CharacterDataSource.Local localCharacterDataSource = null;
    
    public DefaultCharacterRepository(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.dataSource.interfaces.CharacterDataSource.Remote remoteCharacterDataSource, @org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.dataSource.interfaces.CharacterDataSource.Local localCharacterDataSource) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object init(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.characterservice.data.model.Character>> getCharacterList() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.characterservice.data.model.Character> getCharacterById(int id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateCharacter(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.model.Character character, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object refresh(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}