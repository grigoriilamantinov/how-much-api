package com.shop.howmuchapi.controllers;

import com.shop.howmuchapi.dto.CalculatedCart;
import com.shop.howmuchapi.dto.Cart;
import com.shop.howmuchapi.services.HowMuchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carts")
public class HowMuchController {
    private HowMuchService serviceLayer;

    public HowMuchController(
        @Autowired final HowMuchService serviceLayer
    ) {
        this.serviceLayer = serviceLayer;
    }

    @PutMapping()
    public CalculatedCart calculateCart (@RequestBody final Cart cart) {
        return serviceLayer.getCalculatedCart(cart);
    }
}
