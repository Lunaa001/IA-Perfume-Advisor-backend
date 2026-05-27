package com.iaperfumeadvisor.ai;

import org.springframework.stereotype.Component;

@Component
public class KeywordAnalyzer {

    public java.util.List<String> analyzeKeywords(String text) {
        return java.util.Collections.singletonList(text);
    }

    public String extractMainKeyword(String text) {
        return text.split(" ")[0];
    }
}
