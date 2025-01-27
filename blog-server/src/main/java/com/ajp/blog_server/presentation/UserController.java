package com.ajp.blog_server.presentation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 사용자 관리 컨트롤러
 *<p>
 * 쇼핑몰 사용자 정보를 생성, 조회, 수정, 삭제하는 REST API를 제공합니다.
 * 주요 기능:
 * - 사용자 로그인
 *</p>
 * 작성일: 2025-01-27
 */
@RestController
public class UserController {

    @CrossOrigin
    @GetMapping("member")
    public String index() {
        return "{data:\"hi\"}";
    }


}
