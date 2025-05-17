package com.example.server.service;

import com.example.server.dto.BookDto;
import com.example.server.dto.PassportDto;
import com.example.server.dto.UserDto;
import org.springframework.data.domain.Page;


import java.util.List;

public interface UserService {
    void create(UserDto user);

    List<UserDto> findUsersByAgeRange(int minAge, int maxAge);
    Page<UserDto> findUsersByNameContaining(String name, int page, int size);
    void deleteUserById(Long id);

    List<BookDto> findUserBooks(Long userId);
    List<BookDto> findUserFavoriteBooks(Long userId);
    List<PassportDto> findUserPassports(Long userId);
}


