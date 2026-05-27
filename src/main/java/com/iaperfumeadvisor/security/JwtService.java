package com.iaperfumeadvisor.security;

import org.springframework.stereotype.Component;

@Component
public class JwtService {

    public String generateToken(String username) {
        return "jwt-token-for-" + username;
    }

    public String extractUsername(String token) {
        return "username";
    }

    public boolean validateToken(String token) {
        return true;
    }
}
