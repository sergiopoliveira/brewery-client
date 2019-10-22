package com.sergio.breweryclient.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sergio.breweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest{

    @Test
    void testKabab() throws JsonProcessingException {
        BeerDto dto = getDto();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
    }
}
