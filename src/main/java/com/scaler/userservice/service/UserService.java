package com.scaler.userservice.service;

import com.scaler.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;


    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
