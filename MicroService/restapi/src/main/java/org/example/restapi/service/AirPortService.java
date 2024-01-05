package org.example.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class AirPortService {
    @Autowired
    WebClient.Builder webClientBuilder;

    public Mono<String> getAirPorts() {
        return webClientBuilder.build()
                .get()
                .uri("http://serviceapi/flight/airports")
                .retrieve()
                .bodyToMono(String.class);
    }
}
