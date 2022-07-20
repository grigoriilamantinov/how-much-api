package com.shop.howmuchapi.services;

import com.shop.howmuchapi.dto.CalculatedCart;
import com.shop.howmuchapi.dto.Cart;

public interface ServiceLayer {
    CalculatedCart getCalculatedCart (Cart cart);
}
