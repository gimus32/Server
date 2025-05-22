package com.example.server.repository.repository2;

import com.example.server.model.entity.entity2.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
    List<UsersEntity> findAllByUsername(String username);
    boolean existsByUsername(String username);
}

