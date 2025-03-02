//package com.ajp.blog_server.domain.user.dto;
//
//import ch.qos.logback.core.util.StringUtil;
//
///**
// * 사용자 Request
// *<p>
// * 홈쇼핑 사용자 관련 Request 정보이다.
// *</p>
// */
//public record UserRequest(
//        String userId,
//        String password
//) {
//    public UserRequest {
//        if(StringUtil.isNullOrEmpty(userId))
//            throw new IllegalArgumentException("userId should not be null or empty");
//
//        if(StringUtil.isNullOrEmpty(password))
//            throw new IllegalArgumentException("password should not be null or empty");
//    }
//}
