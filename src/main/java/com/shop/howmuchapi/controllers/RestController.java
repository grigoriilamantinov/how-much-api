package com.shop.howmuchapi.controllers;

import com.shop.howmuchapi.dto.CalculatedCart;
import com.shop.howmuchapi.dto.Cart;
import com.shop.howmuchapi.services.HowMuchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/carts")
public class RestController {
    private HowMuchService serviceLayer;

    public RestController(
        @Autowired final HowMuchService serviceLayer
    ) {
        this.serviceLayer = serviceLayer;
    }

    @PostMapping()
    public CalculatedCart calculateCart (@RequestBody final Cart cart) {
        return serviceLayer.getCalculatedCart(cart);
    }
}
