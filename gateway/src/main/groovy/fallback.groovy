//package com.roytuts.spring.cloud.gateway.rest.controller;
package com.example.gateway
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class fallback {

    @GetMapping("/fx-exchange/fallback")
    Mono<String> getFxSvcMsg() {
        return Mono.just("No response from Service1 and will be back shortly");
    }


}