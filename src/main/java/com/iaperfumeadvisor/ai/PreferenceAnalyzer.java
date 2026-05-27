package com.iaperfumeadvisor.ai;

import org.springframework.stereotype.Component;

@Component
public class PreferenceAnalyzer {

    public java.util.Map<String, Object> analyzePreferences(String preferences) {
        return new java.util.HashMap<>();
    }

    public String extractCategory(String preferences) {
        return "FLORAL";
    }

    public String extractBudget(String preferences) {
        return "MEDIUM";
    }
}
