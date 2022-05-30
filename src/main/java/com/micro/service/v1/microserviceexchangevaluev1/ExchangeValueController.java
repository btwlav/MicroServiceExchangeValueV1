package com.micro.service.v1.microserviceexchangevaluev1;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ExchangeValueController {

    private final Environment environment;

    private final ExchangeValueRepo exchangeValueRepo;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue abc(@PathVariable("from") String from, @PathVariable("to") String to) {
        ExchangeValue exchangeValue = exchangeValueRepo.findByFromAndTo(from, to);

        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return exchangeValue;
    }
}
