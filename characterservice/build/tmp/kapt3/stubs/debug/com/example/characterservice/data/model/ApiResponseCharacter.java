package com.example.characterservice.data.model;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J%\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/characterservice/data/model/ApiResponseCharacter;", "", "info", "Lcom/example/characterservice/data/model/Info;", "results", "", "Lcom/example/characterservice/data/model/Character;", "(Lcom/example/characterservice/data/model/Info;Ljava/util/List;)V", "getInfo$annotations", "()V", "getInfo", "()Lcom/example/characterservice/data/model/Info;", "getResults$annotations", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "characterservice_debug"})
public final class ApiResponseCharacter {
    @org.jetbrains.annotations.Nullable()
    private final com.example.characterservice.data.model.Info info = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.characterservice.data.model.Character> results = null;
    
    public ApiResponseCharacter(@org.jetbrains.annotations.Nullable()
    com.example.characterservice.data.model.Info info, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.characterservice.data.model.Character> results) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.characterservice.data.model.Info getInfo() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "info")
    @java.lang.Deprecated()
    public static void getInfo$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.characterservice.data.model.Character> getResults() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "results")
    @java.lang.Deprecated()
    public static void getResults$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.characterservice.data.model.Info component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.characterservice.data.model.Character> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.characterservice.data.model.ApiResponseCharacter copy(@org.jetbrains.annotations.Nullable()
    com.example.characterservice.data.model.Info info, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.characterservice.data.model.Character> results) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}