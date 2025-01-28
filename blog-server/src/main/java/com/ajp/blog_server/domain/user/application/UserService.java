package com.ajp.blog_server.domain.user.application;

import com.ajp.blog_server.domain.user.dto.UserRequest;
import com.ajp.blog_server.domain.user.dto.UserResponse;

/**
 * 사용자 서비스
 *<p>
 * 홈쇼핑 사용자 관련 서비스를 처리합니다.
 *</p>
 */
public interface UserService {

    UserResponse getUserInfoForLogin(UserRequest userRequest);
}
