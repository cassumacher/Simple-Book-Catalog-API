package com.bookcatalog.springboot.crudproject.repository;

import com.bookcatalog.springboot.crudproject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// This interface represents a repository for managing UserEntity objects in the database.
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // Method signature to find a user by their username.
    UserEntity findByUsername(String username);

}
