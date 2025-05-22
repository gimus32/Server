package com.example.server.repository;

import com.example.server.model.entity.FavoriteBooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FavoriteBooksRepository extends JpaRepository<FavoriteBooksEntity, Long> {
    List<FavoriteBooksEntity> findByUserId(Long userId);
}
