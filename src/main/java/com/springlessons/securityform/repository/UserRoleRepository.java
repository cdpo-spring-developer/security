package com.springlessons.securityform.repository;

import com.springlessons.securityform.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    Optional<UserRole> findByRoleType(UserRole.RoleType roleType);
}
