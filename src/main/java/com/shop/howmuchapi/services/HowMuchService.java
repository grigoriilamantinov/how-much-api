package com.shop.howmuchapi.services;

import com.shop.howmuchapi.dto.CalculatedCart;
import com.shop.howmuchapi.dto.CalculatedItem;
import com.shop.howmuchapi.dto.Cart;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Service
public class HowMuchService implements ServiceLayer {


    @Override
    public CalculatedCart getCalculatedCart(Cart cart) {
        var calculatedItems = cart.getItems().stream()
            .map(CalculatedItem::of)
            .collect(Collectors.toList());
        var sum = calculatedItems.stream()
            .flatMapToDouble(calculatedItem -> DoubleStream.of(calculatedItem.getThisItemSum()))
            .sum();
        return new CalculatedCart(calculatedItems, (float) sum);
    }
}
