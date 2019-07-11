package com.example.apigatewayservice.client;

import com.example.apigatewayservice.dto.Beer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("beer-catalog-service")
public interface BeerClient {
    @GetMapping("/beers")
    Resources<Beer> readBeers();
}
