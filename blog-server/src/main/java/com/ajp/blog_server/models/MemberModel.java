package com.ajp.blog_server.models;

import jakarta.persistence.*;

@Table(name = "member")
@Entity
public class MemberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String username;
}
