package com.iaperfumeadvisor.service.impl;

import com.iaperfumeadvisor.dto.request.client.RecommendationRequest;
import com.iaperfumeadvisor.dto.response.RecommendationResponse;
import com.iaperfumeadvisor.service.RecommendationService;
import org.springframework.stereotype.Service;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    @Override
    public RecommendationResponse getRecommendations(RecommendationRequest request) {
        return RecommendationResponse.builder()
                .recommendations(java.util.Collections.emptyList())
                .explanation("Recommendations based on preferences")
                .build();
    }

    @Override
    public RecommendationResponse getRecommendationsByPreferences(String preferences) {
        return RecommendationResponse.builder()
                .recommendations(java.util.Collections.emptyList())
                .explanation("Recommendations based on preferences: " + preferences)
                .build();
    }
}
