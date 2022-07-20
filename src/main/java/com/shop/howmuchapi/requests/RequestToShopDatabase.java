package com.shop.howmuchapi.requests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Component
public class RequestToShopDatabase implements Request {

    @Value("${URL_TO_SHOP_DB}")
    private String PART_URL;

    @Override
    public float getCost(final int id) {
//        final String FULL_URL = PART_URL + id;
//        RestTemplate restTemplate = new RestTemplate();
//        final var responseEntity = restTemplate.getForEntity(FULL_URL, float.class);
//        return Objects.requireNonNull(responseEntity.getBody());
        return 10;
    }
}
