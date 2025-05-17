package com.example.server.repository;

import com.example.server.model.PassportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassportRepository extends JpaRepository<PassportEntity, Long> {
    List<PassportEntity> findAllByUser_Id(Long userId);
}
