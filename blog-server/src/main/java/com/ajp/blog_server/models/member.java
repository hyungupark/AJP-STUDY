package com.ajp.blog_server.models;

import jakarta.persistence.*;

@Entity
public class member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String username;
}
