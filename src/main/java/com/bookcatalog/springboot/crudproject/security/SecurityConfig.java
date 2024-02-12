package com.bookcatalog.springboot.crudproject.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


 //This class configures authentication and authorization for the application.
@Configuration
@EnableWebSecurity
public class SecurityConfig {

     //UserDetailsService dependency for loading user details
    private UserDetailsService userDetailsService;


     // Constructor to inject UserDetailsService.
    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    //Configures user details service and password encoder.
    @Bean
        public DaoAuthenticationProvider daoAuthenticationProvider(){
            DaoAuthenticationProvider provider
                    =new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
            return provider;
        }

      //Configures HTTP security settings.
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // Configure HttpSecurity
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests((authorize) -> {
                    // Allow all requests except for those that require authentication
                    authorize.anyRequest().authenticated();
                }).httpBasic(Customizer.withDefaults());
        // Build and return SecurityFilterChain
        return http.build();

    }
//Configures web security settings to ignore certain requests.
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){

        return (web) -> web.ignoring().requestMatchers("/js/**", "/images/**");
    }
}

