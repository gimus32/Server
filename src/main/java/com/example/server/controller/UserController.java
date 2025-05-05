package com.example.server.controller;

import com.example.server.dto.UserDto;
import com.example.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("user/create")
    public ResponseEntity<String> createUser(@RequestBody UserDto user) {
        userService.create(user);
        return ResponseEntity.status(HttpStatus.OK).body("User created successfully");

    }


    @PostMapping("/users/age")
    public List<UserDto> getUsersByAgeRange(@RequestBody AgeRange ageRange) {
        userService.findUsersByAgeRange(ageRange.getMinAge(), ageRange.getMaxAge());
        return List.copyOf(userService.findUsersByAgeRange(ageRange.getMinAge(), ageRange.getMaxAge()));
    }
    @GetMapping("/user/name")
    public Page<UserDto> getUsersByName(@RequestParam(defaultValue = "") String name,
                                        @RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "10") int size) {
        return userService.findUsersByNameContaining(name, page, size);

    }
    @DeleteMapping("/user/id")
    public ResponseEntity<Void> deleteUser(@RequestParam(defaultValue = "1") Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}

//Паттерн
//Архитектурный
//MVC - модель вью контроллер


//    @GetMapping("/user/{id}")
//    public UserDto getUserById(@PathVariable("id") long id) {
//
//    }