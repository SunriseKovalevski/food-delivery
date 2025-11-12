package com.innowise.kovalevski_vv.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRole {
    @EmbeddedId
    private UserRoleId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("roleId")
    @JoinColumn(name = "role_id")
    private Role role;

    // Constructors, getters, and setters
    public UserRole() {}

    // Add getters and setters for all fields
}

@Embeddable
class UserRoleId implements java.io.Serializable {
    private Long userId;
    private Long roleId;

    // Constructors, equals, hashCode
    public UserRoleId() {}

    // Add getters, setters, equals, hashCode
}