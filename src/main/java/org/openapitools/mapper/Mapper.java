package org.openapitools.mapper;

import org.openapitools.jackson.nullable.JsonNullable;

public interface Mapper<Entity, Dto>{
    Entity dtoToEntity(Dto dto);
    Dto entityToDto(Entity entity);

    default <T> T map(JsonNullable<T> value){
        if(value == null || !value.isPresent()) return null;
        return value.get();
    }

    default <T> JsonNullable<T> map(T value){
        return JsonNullable.of(value);
    }
}
