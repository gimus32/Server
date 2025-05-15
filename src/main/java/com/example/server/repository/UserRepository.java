package com.example.server.repository;

import com.example.server.model.BookEntity;
import com.example.server.model.UserEntity;
import jakarta.persistence.Id;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByAgeBetween(int minAge, int maxAge);
    Page<UserEntity> findAllByUsernameContaining(String username, Pageable pageable);

}
