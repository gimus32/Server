package com.example.server.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import java.util.List;

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

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<BookEntity> books;

    @ManyToMany
    @JoinTable(
            name = "favorite_books",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<BookEntity> favoriteBooks;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<PassportEntity> passports;

}

