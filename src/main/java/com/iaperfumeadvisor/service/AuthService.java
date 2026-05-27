package com.iaperfumeadvisor.service;

import com.iaperfumeadvisor.dto.request.admin.LoginRequest;
import com.iaperfumeadvisor.dto.response.AuthResponse;

public interface AuthService {

    AuthResponse login(LoginRequest request);

    void logout(String token);

    boolean validateToken(String token);
}
