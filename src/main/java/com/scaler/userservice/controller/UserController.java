package com.scaler.userservice.controller;

import com.scaler.userservice.dtos.SignUpRequestDto;
import com.scaler.userservice.dtos.UserDto;
import com.scaler.userservice.service.UserService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 1. SignUp Controller method
    // localhost:8080/users/signUp
    @PostMapping("/signUp")
    public UserDto signUp(@RequestBody SignUpRequestDto signUpRequestDto) {
        User user = userService.
    }
}
