package org.nrservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "org.nrservicetwo")
@EnableFeignClients
public class ServerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerServiceApplication.class, args);
    }
}


