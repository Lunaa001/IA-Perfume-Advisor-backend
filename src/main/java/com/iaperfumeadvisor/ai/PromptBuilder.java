package com.iaperfumeadvisor.ai;

import org.springframework.stereotype.Component;

@Component
public class PromptBuilder {

    public String buildRecommendationPrompt(String preferences, String budget, String occasion) {
        return "Recommend perfumes based on: " + preferences + ", Budget: " + budget + ", Occasion: " + occasion;
    }

    public String buildChatPrompt(String message) {
        return "User says: " + message;
    }
}
