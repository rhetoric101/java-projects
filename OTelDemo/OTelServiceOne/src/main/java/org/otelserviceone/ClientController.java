package org.otelserviceone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final ProverbClient proverbClient;

    public ClientController(ProverbClient proverbClient) {
        this.proverbClient = proverbClient;
    }

    @GetMapping("/proverb")
    public Proverb getRandomProverb() {
        return proverbClient.getRandomProverb();
    }
}

