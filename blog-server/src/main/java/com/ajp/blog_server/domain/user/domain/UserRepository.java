package com.ajp.blog_server.domain.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 사용자 엔티티 인터페이스
 *<p>
 * 사용자 엔티티 관련 JpaRepository를 확장하여 CRUD와 추가적인 데이터 조작 기능
 *</p>
 */
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserIdAndPassword(String userId, String password);
}
