package com.ajp.blog_server.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 사용자 엔티티
 * <p>
 * 쇼핑몰 블로그 회원 정보를 관리하기 위한 JPA 엔티티 클래스입니다.
 * - 데이터베이스 테이블: users
 * - 주요 필드: 사용자 ID, 이름, 이메일, 비밀번호, 가입일시
 * <p>
 * 작성일: 2025-01-27
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;
}
