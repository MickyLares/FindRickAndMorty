package com.example.locationservice.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/locationservice/utils/LocationMappers;", "", "map", "Lcom/example/locationservice/domain/model/LocationDomain;", "data", "Lcom/example/locationservice/data/model/Location;", "", "locationservice_debug"})
public abstract interface LocationMappers {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.locationservice.domain.model.LocationDomain> map(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.locationservice.data.model.Location> data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.locationservice.domain.model.LocationDomain map(@org.jetbrains.annotations.NotNull()
    com.example.locationservice.data.model.Location data);
}