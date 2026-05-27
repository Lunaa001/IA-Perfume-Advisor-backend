package com.iaperfumeadvisor.service.impl;

import com.iaperfumeadvisor.dto.request.client.ChatRequest;
import com.iaperfumeadvisor.dto.response.ChatResponse;
import com.iaperfumeadvisor.service.ChatService;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ChatServiceImpl implements ChatService {

    @Override
    public ChatResponse sendMessage(ChatRequest request) {
        return ChatResponse.builder()
                .response(processUserInput(request.getMessage()))
                .timestamp(LocalDateTime.now().toString())
                .build();
    }

    @Override
    public String processUserInput(String message) {
        return "Response to: " + message;
    }
}
