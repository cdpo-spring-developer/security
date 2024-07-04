package com.springlessons.securityform.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole {
    @Id
    @GeneratedValue
    private int id;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public enum RoleType {
        // может просматривать задачи, в которых является исполнителем
        ROLE_USER,
        // может просматривать задачи, в которых является ответственным (автором)
        // может просматривать задачи, в которых является исполнителем
        ROLE_SUPER_USER // может создавать задачи,
    }
}
