package com.example.locationservice.data.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/locationservice/data/service/LocationApi;", "", "fetchListLocations", "", "Lcom/example/locationservice/data/model/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "locationservice_debug"})
public abstract interface LocationApi {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchListLocations(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.locationservice.data.model.Location>> $completion);
}