package com.shop.howmuchapi.services;

import com.shop.howmuchapi.dto.CalculatedCart;
import com.shop.howmuchapi.dto.Cart;

public interface HowMuchService {
    CalculatedCart getCalculatedCart (Cart cart);
}
