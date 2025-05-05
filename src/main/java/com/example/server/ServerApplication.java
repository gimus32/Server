package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}

//создать таблицу что бы работало
// CREATE TABLE users (
//    user_id SERIAL PRIMARY KEY,
//    user_name VARCHAR(255),
//    user_pass VARCHAR(255),
//    user_age INT,
//    user_email VARCHAR(255)
//