package com.example.rickandmortyfinder.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/rickandmortyfinder/db/PreferenceDao;", "", "deletePreference", "", "preference", "Lcom/example/rickandmortyfinder/model/Preference;", "(Lcom/example/rickandmortyfinder/model/Preference;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPreference", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPreference", "updatePreference", "app_debug"})
@androidx.room.Dao()
public abstract interface PreferenceDao {
    
    @androidx.room.Query(value = "SELECT * FROM preference WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPreference(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.rickandmortyfinder.model.Preference> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertPreference(@org.jetbrains.annotations.NotNull()
    com.example.rickandmortyfinder.model.Preference preference, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePreference(@org.jetbrains.annotations.NotNull()
    com.example.rickandmortyfinder.model.Preference preference, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePreference(@org.jetbrains.annotations.NotNull()
    com.example.rickandmortyfinder.model.Preference preference, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}