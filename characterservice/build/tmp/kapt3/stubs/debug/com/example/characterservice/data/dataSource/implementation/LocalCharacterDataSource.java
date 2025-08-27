package com.example.characterservice.data.dataSource.implementation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/characterservice/data/dataSource/implementation/LocalCharacterDataSource;", "Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource$Local;", "characterDao", "Lcom/example/characterservice/db/CharacterDao;", "(Lcom/example/characterservice/db/CharacterDao;)V", "getAllCharactersFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/characterservice/data/model/Character;", "getCharacterByIdFlow", "id", "", "saveCharacter", "", "chacters", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCharacter", "character", "(Lcom/example/characterservice/data/model/Character;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "characterservice_debug"})
public final class LocalCharacterDataSource implements com.example.characterservice.data.dataSource.interfaces.CharacterDataSource.Local {
    @org.jetbrains.annotations.NotNull()
    private final com.example.characterservice.db.CharacterDao characterDao = null;
    
    public LocalCharacterDataSource(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.db.CharacterDao characterDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveCharacter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.characterservice.data.model.Character> chacters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateCharacter(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.model.Character character, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.characterservice.data.model.Character>> getAllCharactersFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.characterservice.data.model.Character> getCharacterByIdFlow(int id) {
        return null;
    }
}