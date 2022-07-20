package com.shop.howmuchapi.requests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Component
public class RequestToShopDatabase {

    @Value("${URL_TO_SHOP_DB}")
    private static String PART_URL;

    @Cacheable("cost_cache")
    public float getCost(final int id) {
        final String FULL_URL = PART_URL + id;
        RestTemplate restTemplate = new RestTemplate();
        final var responseEntity = restTemplate.getForEntity(FULL_URL, float.class);
        return Objects.requireNonNull(responseEntity.getBody());
    }
}
