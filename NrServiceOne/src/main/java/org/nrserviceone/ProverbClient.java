package org.nrserviceone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "proverb-service", url = "http://nrservicetwo:8080")
public interface ProverbClient {

    @GetMapping("/proverb")
    Proverb getRandomProverb();
}
