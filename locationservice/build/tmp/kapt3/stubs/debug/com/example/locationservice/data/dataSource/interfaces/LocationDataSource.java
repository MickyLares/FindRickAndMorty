package com.example.locationservice.data.dataSource.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/locationservice/data/dataSource/interfaces/LocationDataSource;", "", "fetchLocations", "", "Lcom/example/locationservice/data/model/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLocation", "", "locations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "locationservice_debug"})
public abstract interface LocationDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchLocations(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.locationservice.data.model.Location>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveLocation(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.locationservice.data.model.Location> locations, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLocationById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.locationservice.data.model.Location> $completion);
}