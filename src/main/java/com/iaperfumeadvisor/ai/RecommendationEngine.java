package com.iaperfumeadvisor.ai;

import org.springframework.stereotype.Component;

@Component
public class RecommendationEngine {

    public java.util.List<Long> recommendPerfumes(String preferences) {
        return java.util.Collections.emptyList();
    }

    public double calculateScore(String preferences, Long perfumeId) {
        return 0.85;
    }
}
