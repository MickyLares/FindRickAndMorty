package com.example.locationservice.data.dataSource.implementation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/locationservice/data/dataSource/implementation/RemoteLocationDataSource;", "Lcom/example/locationservice/data/dataSource/interfaces/LocationDataSource;", "locationApi", "Lcom/example/locationservice/data/service/LocationApi;", "locationDao", "Lcom/example/locationservice/db/LocationDao;", "(Lcom/example/locationservice/data/service/LocationApi;Lcom/example/locationservice/db/LocationDao;)V", "fetchLocations", "", "Lcom/example/locationservice/data/model/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLocation", "", "locations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "locationservice_debug"})
public final class RemoteLocationDataSource implements com.example.locationservice.data.dataSource.interfaces.LocationDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.example.locationservice.data.service.LocationApi locationApi = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.locationservice.db.LocationDao locationDao = null;
    
    public RemoteLocationDataSource(@org.jetbrains.annotations.NotNull()
    com.example.locationservice.data.service.LocationApi locationApi, @org.jetbrains.annotations.NotNull()
    com.example.locationservice.db.LocationDao locationDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchLocations(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.locationservice.data.model.Location>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveLocation(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.locationservice.data.model.Location> locations, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLocationById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.locationservice.data.model.Location> $completion) {
        return null;
    }
}