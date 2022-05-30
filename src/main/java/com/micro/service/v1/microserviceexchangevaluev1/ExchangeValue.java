package com.micro.service.v1.microserviceexchangevaluev1;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ExchangeValue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "currency_from")
    String from;

    @Column(name = "currency_to")
    String to;

    double conversionMultiple;
    int port;
}
