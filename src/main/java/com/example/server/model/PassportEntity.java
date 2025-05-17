package com.example.server.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users1")
@Data
public class PassportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PassportEnum passport;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserEntity user;


}
