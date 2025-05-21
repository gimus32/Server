package com.example.server.mapping;

import com.example.server.dto.dtoUser.AuthDto;
import com.example.server.dto.dtoUser.AuthResponseDto;
import com.example.server.dto.dtoUser.RegisterDto;
import com.example.server.model.entity.entity2.UsersEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UsersMapper {
    @Mapping(target = "id", ignore = true)
    List<AuthDto> toDtoAuth(List<UsersEntity> usersEntities);
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "token", ignore = true)
    List<AuthResponseDto> toDtoAuthResponse(List<UsersEntity> usersEntities);
    @Mapping(target = "id", ignore = true)
    List<RegisterDto> toDtoRegister(List<UsersEntity> usersEntities);
}
