package org.example.restapi.controller;

import org.example.restapi.service.AirPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.example.restapi.service.DiscoveryService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/rest/*")
@Validated
public class RestApiController {
    private HttpHeaders headers = new HttpHeaders();

    @Autowired
    DiscoveryService discoveryService;
    @Autowired
    AirPortService airPortService;

    @GetMapping(value = "/services", produces = "application/x-www-form-urlencoded")
    public ResponseEntity Get()
    {
        headers.add("Content-Type", "application/json");

        return ResponseEntity.ok().headers(headers).body(discoveryService.getServices());
    }

    @GetMapping(value = "/airports", produces = "application/x-www-form-urlencoded")
    public Mono<String> GetAirPorts()
    {
        headers.add("Content-Type", "application/json");

        return airPortService.getAirPorts();
        //return ResponseEntity.ok().headers(headers).body(airPortService.getAirPorts());
    }
}

