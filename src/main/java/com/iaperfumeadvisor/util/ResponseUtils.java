package com.iaperfumeadvisor.util;

import com.iaperfumeadvisor.dto.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

public class ResponseUtils {

    public static <T> ResponseEntity<T> success(T data) {
        return ResponseEntity.ok(data);
    }

    public static <T> ResponseEntity<T> created(T data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(data);
    }

    public static ResponseEntity<ErrorResponse> error(String message, HttpStatus status) {
        ErrorResponse error = ErrorResponse.builder()
                .status(status.value())
                .message(message)
                .timestamp(java.time.LocalDateTime.now())
                .build();
        return ResponseEntity.status(status).body(error);
    }
}
