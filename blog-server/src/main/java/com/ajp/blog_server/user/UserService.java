package com.ajp.blog_server.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    /// Constructor
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /// Create
    public UserEntity createUser(UserEntity user) {
        return this.userRepository.save(user);
    }

    /// Read
    public List<UserEntity> selectAll() {
        return this.userRepository.findAll();
    }

    public Optional<UserEntity> selectByUsernameAndPassword(String username, String password) {
        return this.userRepository.findByUsernameAndPassword(username, password);
    }
}
