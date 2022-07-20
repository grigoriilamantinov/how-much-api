package com.shop.howmuchapi.controllers;

import com.shop.howmuchapi.dto.CalculatedCart;
import com.shop.howmuchapi.dto.Cart;
import com.shop.howmuchapi.services.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/carts")
public class HowMuchController {
    private ServiceLayer serviceLayer;

    public HowMuchController(
        @Autowired ServiceLayer serviceLayer
    ) {
        this.serviceLayer = serviceLayer;
    }

    @GetMapping()
    public CalculatedCart getCalculatedCart (@PathVariable final Cart cart) {
        return serviceLayer.getCalculatedCart(cart);
    }
}
