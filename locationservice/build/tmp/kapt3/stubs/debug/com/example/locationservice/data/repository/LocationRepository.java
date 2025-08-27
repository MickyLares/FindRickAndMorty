package com.example.locationservice.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/example/locationservice/data/repository/LocationRepository;", "", "getLocationById", "Lcom/example/locationservice/data/model/Location;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "", "locationservice_debug"})
public abstract interface LocationRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object init(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLocationList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.locationservice.data.model.Location>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLocationById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.locationservice.data.model.Location> $completion);
}