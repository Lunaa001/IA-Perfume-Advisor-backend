package com.iaperfumeadvisor.util;

public class WhatsAppUtils {

    private static final String WHATSAPP_API_URL = "https://wa.me/";

    public static String buildWhatsAppLink(String phoneNumber, String message) {
        return WHATSAPP_API_URL + phoneNumber + "?text=" + encodeMessage(message);
    }

    private static String encodeMessage(String message) {
        return message.replace(" ", "%20");
    }

    public static String formatPhoneNumber(String phoneNumber) {
        return phoneNumber.replaceAll("[^0-9]", "");
    }
}
