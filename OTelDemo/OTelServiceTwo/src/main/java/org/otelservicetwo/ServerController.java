package org.otelservicetwo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @Autowired
    private ProverbService proverbService;

    @GetMapping("/proverb")
    public Proverb getRandomProverb() {
        return proverbService.getRandomProverb();
    }
}
