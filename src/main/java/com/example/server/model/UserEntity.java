package com.example.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "user_pass")
    private String password;

    @Column(name = "user_age")
    private int age;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_phone")
    private String phone;
}
