package com.example.server.service.impl;

import com.example.server.dto.BookDto;
import com.example.server.dto.FavoriteBooksDto;
import com.example.server.dto.PassportDto;
import com.example.server.dto.UserDto;
import com.example.server.mapping.UserMapper;
import com.example.server.model.entity.BookEntity;
import com.example.server.model.entity.FavoriteBooksEntity;
import com.example.server.model.entity.PassportEntity;
import com.example.server.model.entity.UserEntity;
import com.example.server.repository.BookRepository;
import com.example.server.repository.FavoriteBooksRepository;
import com.example.server.repository.PassportRepository;
import com.example.server.repository.UserRepository;
import com.example.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final BookRepository bookRepository;
    private final PassportRepository passportRepository;
    private final FavoriteBooksRepository favoriteBookRepository;

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
    public List<FavoriteBooksDto> findUserFavoriteBooks(Long userId) {
        List<FavoriteBooksEntity> favoriteBooks = favoriteBookRepository.findByUserId(userId);
        return userMapper.toDtoFavoriteBooks(favoriteBooks);
    }

    @Override
    @Transactional
    public List<PassportDto> findUserPassports(Long userId) {
        List<PassportEntity> passports = passportRepository.findAllByUser_Id(userId);
        return userMapper.toDtoPassport(passports);
    }
}





