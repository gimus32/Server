package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private long id;
    private String username;
    private String password;
    private int age;
    private String email;
    private String phone;
}

// data transfer object
