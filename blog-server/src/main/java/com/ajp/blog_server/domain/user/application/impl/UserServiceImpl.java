//package com.ajp.blog_server.domain.user.application.impl;
//
//import com.ajp.blog_server.domain.user.application.UserService;
//import com.ajp.blog_server.domain.user.domain.User;
//import com.ajp.blog_server.domain.user.domain.UserRepository;
//import com.ajp.blog_server.domain.user.dto.UserRequest;
//import com.ajp.blog_server.domain.user.dto.UserResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
///**
// * 사용자 서비스 구현체
// * <p>
// * 홈쇼핑 사용자 관련 비즈니스 로직을 처리합니다.
// * </p>
// */
//@Service
//@RequiredArgsConstructor
//public class UserServiceImpl implements UserService {
//
//    private final UserRepository userRepository;
//
//    @Override
//    @Transactional(readOnly = true)
//    public UserResponse getUserInfoForLogin(UserRequest userRequest) {
//
//        User targetUserInfo =
//                Optional.ofNullable(userRepository.findByUserIdAndPassword(userRequest.userId(), userRequest.password()))
//                        .orElseThrow(() -> new NullPointerException("User not found"));
//
//        return UserResponse.toResponse(targetUserInfo.getUsername());
//    }
//}
