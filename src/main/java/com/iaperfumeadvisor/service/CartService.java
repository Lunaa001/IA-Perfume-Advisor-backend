package com.iaperfumeadvisor.service;

import com.iaperfumeadvisor.dto.request.client.AddToCartRequest;
import com.iaperfumeadvisor.dto.request.client.UpdateCartItemRequest;
import com.iaperfumeadvisor.dto.response.CartResponse;

public interface CartService {

    CartResponse getCart();

    CartResponse addItem(AddToCartRequest request);

    CartResponse updateItem(UpdateCartItemRequest request);

    CartResponse removeItem(Long cartItemId);

    CartResponse checkout();
}
