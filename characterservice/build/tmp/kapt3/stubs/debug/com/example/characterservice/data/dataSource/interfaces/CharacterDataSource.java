package com.example.characterservice.data.dataSource.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource;", "", "Local", "Remote", "characterservice_debug"})
public abstract interface CharacterDataSource {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a6@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource$Local;", "", "getAllCharactersFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/characterservice/data/model/Character;", "getCharacterByIdFlow", "id", "", "saveCharacter", "", "chacters", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCharacter", "character", "(Lcom/example/characterservice/data/model/Character;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "characterservice_debug"})
    public static abstract interface Local {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object saveCharacter(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.characterservice.data.model.Character> chacters, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object updateCharacter(@org.jetbrains.annotations.NotNull()
        com.example.characterservice.data.model.Character character, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
        
        @org.jetbrains.annotations.NotNull()
        public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.characterservice.data.model.Character>> getAllCharactersFlow();
        
        @org.jetbrains.annotations.NotNull()
        public abstract kotlinx.coroutines.flow.Flow<com.example.characterservice.data.model.Character> getCharacterByIdFlow(int id);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/characterservice/data/dataSource/interfaces/CharacterDataSource$Remote;", "", "fetchCharacter", "", "Lcom/example/characterservice/data/model/Character;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "characterservice_debug"})
    public static abstract interface Remote {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object fetchCharacter(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<com.example.characterservice.data.model.Character>> $completion);
    }
}