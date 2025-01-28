package com.example.eAlkohol;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
