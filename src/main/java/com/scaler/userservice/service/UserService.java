package com.scaler.userservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scaler.userservice.configs.KafkaProducerClient;
import com.scaler.userservice.repository.TokenRepository;
import com.scaler.userservice.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private TokenRepository tokenRepository;
    private KafkaProducerClient kafkaProducerClient;
    private ObjectMapper objectMapper;


    UserService(UserRepository userRepository,
                BCryptPasswordEncoder bCryptPasswordEncoder,
                TokenRepository tokenRepository,
                KafkaProducerClient kafkaProducerClient,
                ObjectMapper objectMapper) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.tokenRepository = tokenRepository;
        this.kafkaProducerClient = kafkaProducerClient;
        this.objectMapper = objectMapper;
    }
}
