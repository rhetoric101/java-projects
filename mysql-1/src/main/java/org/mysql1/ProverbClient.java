package org.mysql1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "proverb-service", url = "http://localhost:8080")
public interface ProverbClient {

    @GetMapping("/proverb")
    Proverb getRandomProverb();
}
