package com.iaperfumeadvisor.ai;

import org.springframework.stereotype.Component;

@Component
public class ResponseGenerator {

    public String generateResponse(String aiResponse) {
        return "AI Response: " + aiResponse;
    }

    public String generateRecommendationText(java.util.List<String> perfumes) {
        return "Recommended perfumes: " + String.join(", ", perfumes);
    }
}
