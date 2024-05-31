package com.example.SportShop.controller;

import com.example.SportShop.entity.User;

import com.example.SportShop.service.IUserService;
import com.example.SportShop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.FOUND);
    }

    }







