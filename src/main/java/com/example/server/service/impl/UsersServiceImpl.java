package com.example.server.service.impl;

import com.example.server.dto.dtoUser.AuthDto;
import com.example.server.dto.dtoUser.AuthResponseDto;
import com.example.server.dto.dtoUser.RegisterDto;
import com.example.server.mapping.UsersMapper;
import com.example.server.model.entity.entity2.UsersEntity;
import com.example.server.repository.repository2.UsersRepository;
import com.example.server.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;
    private final UsersMapper usersMapper;

    public User loadUserByUsername(String username) throws UsernameNotFoundException{
        UsersEntity user = usersRepository.findAllByUsername(username)
                .stream()
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole()))
        );
    }

    @Override
    public List<AuthDto> findUserAuths(String username) {
        return usersMapper.toDtoAuth(usersRepository.findAllByUsername(username));
    }

    @Override
    public List<AuthResponseDto> findUserAuthResponses(String username) {
        return usersMapper.toDtoAuthResponse(usersRepository.findAllByUsername(username));
    }

    @Override
    public List<RegisterDto> findUserRegisters(String username) {
        return usersMapper.toDtoRegister(usersRepository.findAllByUsername(username));
    }
}
