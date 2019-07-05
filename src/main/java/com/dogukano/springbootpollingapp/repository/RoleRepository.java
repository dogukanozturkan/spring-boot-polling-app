package com.dogukano.springbootpollingapp.repository;

import com.dogukano.springbootpollingapp.model.Role;
import com.dogukano.springbootpollingapp.model.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
