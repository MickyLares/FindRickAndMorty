package com.example.locationservice.domain.useCase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/locationservice/domain/useCase/DefaultGetLocationByIdUseCase;", "Lcom/example/locationservice/domain/useCase/GetLocationByIdUseCase;", "repository", "Lcom/example/locationservice/data/repository/LocationRepository;", "mappers", "Lcom/example/locationservice/utils/LocationMappers;", "(Lcom/example/locationservice/data/repository/LocationRepository;Lcom/example/locationservice/utils/LocationMappers;)V", "execute", "Lcom/example/locationservice/domain/model/LocationDomain;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "locationservice_debug"})
public final class DefaultGetLocationByIdUseCase implements com.example.locationservice.domain.useCase.GetLocationByIdUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.locationservice.data.repository.LocationRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.locationservice.utils.LocationMappers mappers = null;
    
    public DefaultGetLocationByIdUseCase(@org.jetbrains.annotations.NotNull()
    com.example.locationservice.data.repository.LocationRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.locationservice.utils.LocationMappers mappers) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object execute(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.locationservice.domain.model.LocationDomain> $completion) {
        return null;
    }
}