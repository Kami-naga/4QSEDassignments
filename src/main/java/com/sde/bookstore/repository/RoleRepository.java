package com.sde.bookstore.repository;

import com.sde.bookstore.domain.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role,Long> {

    Optional<Role> findByRoleName(String name);
}