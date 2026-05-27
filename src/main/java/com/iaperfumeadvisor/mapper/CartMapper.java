package com.iaperfumeadvisor.mapper;

import com.iaperfumeadvisor.dto.response.CartResponse;
import org.springframework.stereotype.Component;

@Component
public class CartMapper {

    public CartResponse toResponse(com.iaperfumeadvisor.cart.Cart cart) {
        return CartResponse.builder()
                .id(cart.getId())
                .items(java.util.Collections.emptyList())
                .totalPrice(java.math.BigDecimal.ZERO)
                .totalItems(0)
                .build();
    }
}
