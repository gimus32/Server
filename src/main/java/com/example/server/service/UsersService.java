package com.example.server.service;

import com.example.server.dto.dtoUser.AuthDto;
import com.example.server.dto.dtoUser.AuthResponseDto;
import com.example.server.dto.dtoUser.RegisterDto;
import java.util.List;

public interface UsersService {
    List<AuthDto> findUserAuths(String username);
    List<AuthResponseDto> findUserAuthResponses(String username);
    List<RegisterDto> findUserRegisters(String username);
}
