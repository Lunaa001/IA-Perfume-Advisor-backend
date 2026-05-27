package com.iaperfumeadvisor.util;

public class TextUtils {

    public static String truncate(String text, int length) {
        if (text == null) return null;
        return text.length() > length ? text.substring(0, length) + "..." : text;
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public static String capitalize(String text) {
        if (text == null || text.isEmpty()) return text;
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
