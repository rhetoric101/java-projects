package org.otelservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "org.otelservicetwo")
@EnableFeignClients
public class ServerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerServiceApplication.class, args);
    }
}


