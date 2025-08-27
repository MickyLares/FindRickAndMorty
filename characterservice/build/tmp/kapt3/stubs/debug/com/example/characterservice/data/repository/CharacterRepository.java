package com.example.characterservice.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H&J\u000e\u0010\t\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/characterservice/data/repository/CharacterRepository;", "", "getCharacterById", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/characterservice/data/model/Character;", "id", "", "getCharacterList", "", "init", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCharacter", "character", "(Lcom/example/characterservice/data/model/Character;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "characterservice_debug"})
public abstract interface CharacterRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object init(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.characterservice.data.model.Character>> getCharacterList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.characterservice.data.model.Character> getCharacterById(int id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCharacter(@org.jetbrains.annotations.NotNull()
    com.example.characterservice.data.model.Character character, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}