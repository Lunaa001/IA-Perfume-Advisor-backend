package com.iaperfumeadvisor.service;

import com.iaperfumeadvisor.dto.response.WhatsAppRedirectResponse;

public interface WhatsAppService {

    WhatsAppRedirectResponse getWhatsAppRedirect(String message);

    String generateWhatsAppMessage(String cartSummary);
}
