package com.bookcatalog.springboot.crudproject;


import com.bookcatalog.springboot.crudproject.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

// This class represents custom user details which implements the UserDetails interface.
public class CustomUserDetails implements UserDetails {

    // Private field to hold the user entity.
    private UserEntity userEntity;

    // Constructor to initialize CustomUserDetails with a UserEntity.
    public CustomUserDetails(UserEntity userEntity) {
        super();
        this.userEntity = userEntity;
    }
    // Method to retrieve the authorities (roles) assigned to the user.
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton((new SimpleGrantedAuthority(
                userEntity.getRole()
        )));
    }

    // Method to retrieve the username of the user.
    @Override
    public String getUsername() {
        // Returns the username from the user entity.
        return userEntity.getUsername();
    }

    // Method to retrieve the password of the user.
    @Override
    public String getPassword() {
        // Returns the password from the user entity
        return userEntity.getPassword();
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
