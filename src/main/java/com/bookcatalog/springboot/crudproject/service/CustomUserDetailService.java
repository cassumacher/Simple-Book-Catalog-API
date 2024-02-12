package com.bookcatalog.springboot.crudproject.service;

import com.bookcatalog.springboot.crudproject.CustomUserDetails;
import com.bookcatalog.springboot.crudproject.entity.UserEntity;
import com.bookcatalog.springboot.crudproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// This class implements the UserDetailsService interface to provide custom user details retrieval.
@Service
public class CustomUserDetailService implements UserDetailsService {

    // UserRepository dependency to access user data.
    private final UserRepository userRepository;

    @Autowired // Inject the UserRepository using @Autowired
    public CustomUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // Method to load user details by username.
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Retrieve user entity from the repository based on the provided username.
        UserEntity userEntity = userRepository.findByUsername(username);

        // If user entity is not found, throw UsernameNotFoundException.
        if(userEntity==null){
            throw new UsernameNotFoundException("User not Found");
        }
        return new CustomUserDetails(userEntity);
    }
}
