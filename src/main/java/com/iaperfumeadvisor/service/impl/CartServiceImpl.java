package com.iaperfumeadvisor.service.impl;

import com.iaperfumeadvisor.dto.request.client.AddToCartRequest;
import com.iaperfumeadvisor.dto.request.client.UpdateCartItemRequest;
import com.iaperfumeadvisor.dto.response.CartResponse;
import com.iaperfumeadvisor.service.CartService;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public CartResponse getCart() {
        return CartResponse.builder()
                .items(java.util.Collections.emptyList())
                .totalPrice(java.math.BigDecimal.ZERO)
                .totalItems(0)
                .build();
    }

    @Override
    public CartResponse addItem(AddToCartRequest request) {
        return CartResponse.builder()
                .items(java.util.Collections.emptyList())
                .totalPrice(java.math.BigDecimal.ZERO)
                .totalItems(0)
                .build();
    }

    @Override
    public CartResponse updateItem(UpdateCartItemRequest request) {
        return CartResponse.builder()
                .items(java.util.Collections.emptyList())
                .totalPrice(java.math.BigDecimal.ZERO)
                .totalItems(0)
                .build();
    }

    @Override
    public CartResponse removeItem(Long cartItemId) {
        return CartResponse.builder()
                .items(java.util.Collections.emptyList())
                .totalPrice(java.math.BigDecimal.ZERO)
                .totalItems(0)
                .build();
    }

    @Override
    public CartResponse checkout() {
        return CartResponse.builder()
                .items(java.util.Collections.emptyList())
                .totalPrice(java.math.BigDecimal.ZERO)
                .totalItems(0)
                .build();
    }
}
