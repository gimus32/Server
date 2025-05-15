package com.example.server.repository;

import com.example.server.model.BookEntity;
import com.example.server.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findAllByUserId(Long userId);

}
