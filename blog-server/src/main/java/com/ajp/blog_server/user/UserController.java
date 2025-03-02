package com.ajp.blog_server.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /// Create
    @PostMapping("/user")
    public UserEntity insertUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    /// Read
    @GetMapping("/users")
    public List<UserEntity> selectAllUserS() {
        return userService.selectAll();
    }

    @GetMapping("/user")
    public Optional<UserEntity> selectByUsernameAndPassword(
            @RequestParam String username,
            @RequestParam String password
    ) {
        return Optional
                .ofNullable(userService.selectByUsernameAndPassword(username, password))
                .orElseThrow(() -> null);
    }
}
