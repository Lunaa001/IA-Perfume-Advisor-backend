package com.iaperfumeadvisor.service;

public interface OpenAiService {

    String generateResponse(String prompt);

    String analyzePreferences(String userInput);

    String generateRecommendation(String preferences);
}
