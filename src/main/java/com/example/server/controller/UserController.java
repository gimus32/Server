package com.example.server.controller;

import com.example.server.dto.UserDto;
import com.example.server.dto.AgeRangeDto;
import com.example.server.dto.BookDto;
import com.example.server.dto.FavoriteBooksDto;
import com.example.server.dto.PassportDto;
import com.example.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.security.Principal;
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
    public List<UserDto> getUsersByAgeRange(@RequestBody AgeRangeDto ageRange) {
        userService.findUsersByAgeRange(ageRange.getMinAge(), ageRange.getMaxAge());
        return List.copyOf(userService.findUsersByAgeRange(ageRange.getMinAge(), ageRange.getMaxAge()));
    }

    @GetMapping("/user/name")
    public Page<UserDto> getUsersByName(@RequestParam String name,
                                        @RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "10") int size) {
        return userService.findUsersByNameContaining(name, page, size);
    }

    @DeleteMapping("/user/id")
    public ResponseEntity<Void> deleteUser(@RequestParam(defaultValue = "1") Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/user/{userId}/books")
    public ResponseEntity<List<BookDto>> getUserBooks(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.findUserBooks(userId));
    }

    @GetMapping("/user/{userId}/favorites")
    public ResponseEntity<List<FavoriteBooksDto>> getUserFavoriteBooks(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.findUserFavoriteBooks(userId));
    }

    @PostMapping("/user/{userId}/passports")
    public ResponseEntity<List<PassportDto>> getUserPassports(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.findUserPassports(userId));
    }
}


//Паттерн
//Архитектурный
//MVC - модель вью контроллер


//    @GetMapping("/user/{id}")
//    public UserDto getUserById(@PathVariable("id") long id) {
//
//    }