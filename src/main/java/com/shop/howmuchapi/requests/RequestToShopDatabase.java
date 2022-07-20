package com.shop.howmuchapi.requests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Component
public class RequestToShopDatabase {

    @Value("${URL_TO_SHOP_DB}")
    private String URL;

    public float getCost() {
        RestTemplate restTemplate = new RestTemplate();
        final var responseEntity = restTemplate.getForEntity(URL, float.class);
        return Objects.requireNonNull(responseEntity.getBody());
    }
}
