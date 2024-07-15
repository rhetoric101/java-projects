package org.otelserviceone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "proverb-service", url = "http://otelservicetwo-with-agent:8082")
public interface ProverbClient {

    @GetMapping("/proverb")
    Proverb getRandomProverb();
}
