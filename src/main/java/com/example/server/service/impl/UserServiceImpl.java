package com.example.server.service.impl;

import com.example.server.dto.BookDto;
import com.example.server.dto.UserDto;
import com.example.server.mapping.UserMapper;
import com.example.server.model.BookEntity;
import com.example.server.model.UserEntity;
import com.example.server.repository.BookRepository;
import com.example.server.repository.UserRepository;
import com.example.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final BookRepository bookRepository;


    @Override
    @Transactional
    public void create(UserDto user) {
        userRepository.save(userMapper.toEntity(user));
    }

    @Override
    @Transactional
    public List<UserDto> findUsersByAgeRange(int minAge, int maxAge) {
        List<UserEntity> userEntities = userRepository.findByAgeBetween(minAge, maxAge);
        return userMapper.toDtoList(userEntities);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<UserDto> findUsersByNameContaining(String name, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<UserEntity> entities = userRepository.findAllByUsernameContaining(name, pageable);
        return entities.map(entity -> new UserDto(
                entity.getId(),
                entity.getUsername(),
                entity.getPassword(),
                entity.getAge(),
                entity.getEmail(),
                entity.getPhone()
        ));
    }
    @Override
    @Transactional(readOnly = true)
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    @Transactional
    public List<BookDto> findUserBooks(Long userId) {
        List<BookEntity> books = bookRepository.findAllByUserId(userId);
        return userMapper.toDtoBook(books);
    }

    @Override
    @Transactional
    public List<BookDto> findUserFavoriteBooks(Long userId) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return userMapper.toDtoBook(user.getFavoriteBooks());
    }

}





