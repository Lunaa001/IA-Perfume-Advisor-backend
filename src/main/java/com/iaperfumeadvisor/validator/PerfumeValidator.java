package com.iaperfumeadvisor.validator;

import com.iaperfumeadvisor.dto.request.admin.CreatePerfumeRequest;
import com.iaperfumeadvisor.exception.InvalidInputException;
import org.springframework.stereotype.Component;

@Component
public class PerfumeValidator {

    public void validate(CreatePerfumeRequest request) {
        if (request == null || request.getName() == null || request.getName().trim().isEmpty()) {
            throw new InvalidInputException("Perfume name cannot be empty");
        }
        if (request.getPrice() == null || request.getPrice().compareTo(java.math.BigDecimal.ZERO) <= 0) {
            throw new InvalidInputException("Perfume price must be greater than 0");
        }
    }
}
