package com.example.server.service;

import com.example.server.dto.UserDto;
import org.springframework.data.domain.Page;


import java.util.List;

public interface UserService {
    void create(UserDto user);

    List<UserDto> findUsersByAgeRange(int minAge, int maxAge);
    Page<UserDto> findUsersByNameContaining(String name, int page, int size);

    void deleteUserById(Long id);
}

