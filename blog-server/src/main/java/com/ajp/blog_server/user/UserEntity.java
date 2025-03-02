package com.ajp.blog_server.user;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(
        name = "users",
        indexes = @Index(
                name = "idx_username",
                columnList = "username",
                unique = true
        )
)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id", nullable = false, updatable = false)
    private UUID userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "explore", nullable = false, length = 1)
    @ColumnDefault(value = "1")
    private String explore;

    @Basic(optional = false)
    @Column(name = "created_at", insertable = false, updatable = false, nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;

    @Basic(optional = false)
    @Column(name = "updated_at", insertable = false, updatable = false, nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedAt;
}
