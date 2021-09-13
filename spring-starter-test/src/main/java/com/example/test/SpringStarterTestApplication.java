package com.example.test;

import com.example.starter.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringStarterTestApplication.class, args);
    }

    @Autowired
    private User user;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(user);
    }
}
