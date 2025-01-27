package com.ajp.blog_server.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @CrossOrigin
    @GetMapping("member")
    public String index() {
        return "{data:\"hi\"}";
    }
}
