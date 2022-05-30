package com.micro.service.v1.microserviceexchangevaluev1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ExchangeValueConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(ExchangeValueRepo exchangeValueRepo) {
        return args -> exchangeValueRepo.saveAll(List.of(
                ExchangeValue.builder()
                        .from("EUR")
                        .to("RUB")
                        .conversionMultiple(80)
                        .port(0)
                        .build(),
                ExchangeValue.builder()
                        .from("RUB")
                        .to("EUR")
                        .conversionMultiple(0.14)
                        .port(0)
                        .build()
        ));
    }
}
