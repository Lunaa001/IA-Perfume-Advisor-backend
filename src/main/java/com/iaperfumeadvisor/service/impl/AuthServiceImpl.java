package com.iaperfumeadvisor.service.impl;

import com.iaperfumeadvisor.dto.request.admin.LoginRequest;
import com.iaperfumeadvisor.dto.response.AuthResponse;
import com.iaperfumeadvisor.service.AuthService;
import com.iaperfumeadvisor.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private JwtService jwtService;

    @Override
    public AuthResponse login(LoginRequest request) {
        return AuthResponse.builder()
                .token("jwt-token-here")
                .username(request.getUsername())
                .email("user@example.com")
                .role("USER")
                .build();
    }

    @Override
    public void logout(String token) {

    }

    @Override
    public boolean validateToken(String token) {
        return true;
    }
}
