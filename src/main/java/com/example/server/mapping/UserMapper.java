package com.example.server.mapping;

import com.example.server.dto.UserDto;
import com.example.server.model.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    UserEntity toEntity(UserDto userDto);
    @Mapping(target = "id", ignore = true)
    List<UserDto> toDtoList(List<UserEntity> userEntities);

}
