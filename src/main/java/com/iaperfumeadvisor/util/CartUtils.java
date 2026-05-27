package com.iaperfumeadvisor.util;

public class CartUtils {

    public static java.math.BigDecimal calculateDiscount(java.math.BigDecimal originalPrice, int discountPercentage) {
        return originalPrice.multiply(new java.math.BigDecimal(100 - discountPercentage))
                .divide(new java.math.BigDecimal(100));
    }

    public static java.math.BigDecimal calculateTax(java.math.BigDecimal subtotal, double taxRate) {
        return subtotal.multiply(java.math.BigDecimal.valueOf(taxRate));
    }

    public static java.math.BigDecimal calculateFinalPrice(java.math.BigDecimal subtotal, double taxRate) {
        java.math.BigDecimal tax = calculateTax(subtotal, taxRate);
        return subtotal.add(tax);
    }
}
