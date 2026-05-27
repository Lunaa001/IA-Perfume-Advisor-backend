package com.iaperfumeadvisor.validator;

import com.iaperfumeadvisor.dto.request.client.ChatRequest;
import com.iaperfumeadvisor.exception.InvalidInputException;
import org.springframework.stereotype.Component;

@Component
public class ChatValidator {

    public void validate(ChatRequest request) {
        if (request == null || request.getMessage() == null || request.getMessage().trim().isEmpty()) {
            throw new InvalidInputException("Chat message cannot be empty");
        }
    }
}
