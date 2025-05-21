package com.example.server.controller;

import com.example.server.dto.dtoUser.AuthDto;
import com.example.server.dto.dtoUser.AuthResponseDto;
import com.example.server.dto.dtoUser.RegisterDto;
import com.example.server.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final UsersService usersService;

    @GetMapping("/user/auths")
    public List<AuthDto> getUserAuths(@RequestParam String username) {
        return usersService.findUserAuths(username);
    }

    @GetMapping("/user/auth-responses")
    public List<AuthResponseDto> getUserAuthResponses(@RequestParam String username) {
        return usersService.findUserAuthResponses(username);
    }

    @GetMapping("/user/registers")
    public List<RegisterDto> getUserRegisters(@RequestParam String username) {
        return usersService.findUserRegisters(username);
    }
}
