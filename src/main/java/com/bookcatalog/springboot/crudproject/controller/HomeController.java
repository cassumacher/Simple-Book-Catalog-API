package com.bookcatalog.springboot.crudproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This class is a controller for handling HTTP requests.
@RestController
public class HomeController {

    // GET requests to "/admin" endpoint and requires ADMIN role for access.
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public ResponseEntity<String> adminPage(){
        // Returns a ResponseEntity with HTTP status 200 (OK)
        return ResponseEntity.ok("This is admin page!");
    }
}
