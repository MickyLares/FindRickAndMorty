package com.example.locationservice.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/locationservice/data/repository/DefaultLocationRepository;", "Lcom/example/locationservice/data/repository/LocationRepository;", "remoteLocationDataSource", "Lcom/example/locationservice/data/dataSource/interfaces/LocationDataSource;", "(Lcom/example/locationservice/data/dataSource/interfaces/LocationDataSource;)V", "getLocationById", "Lcom/example/locationservice/data/model/Location;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "", "refresh", "locationservice_debug"})
public final class DefaultLocationRepository implements com.example.locationservice.data.repository.LocationRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.locationservice.data.dataSource.interfaces.LocationDataSource remoteLocationDataSource = null;
    
    public DefaultLocationRepository(@org.jetbrains.annotations.NotNull()
    com.example.locationservice.data.dataSource.interfaces.LocationDataSource remoteLocationDataSource) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object init(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLocationList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.locationservice.data.model.Location>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLocationById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.locationservice.data.model.Location> $completion) {
        return null;
    }
    
    private final java.lang.Object refresh(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}