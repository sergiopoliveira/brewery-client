package com.sergio.breweryclient.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sergio.breweryclient.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto() {
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .upc(123123123123L)
                .build();
    }

}