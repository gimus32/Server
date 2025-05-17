package com.example.server.mapping;

import com.example.server.dto.BookDto;
import com.example.server.dto.PassportDto;
import com.example.server.dto.UserDto;
import com.example.server.model.entity.BookEntity;
import com.example.server.model.entity.PassportEntity;
import com.example.server.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "favoriteBooks", ignore = true)
    UserEntity toEntity(UserDto userDto);

    @Mapping(target = "id", ignore = true)
    List<UserDto> toDtoList(List<UserEntity> userEntities);

    @Mapping(target = "id", ignore = true)
    List<BookDto> toDtoBook(List<BookEntity> bookEntities);

    @Mapping(target = "id", ignore = true)
    List<PassportDto> toDtoPassport(List<PassportEntity> passportEntities);
}
