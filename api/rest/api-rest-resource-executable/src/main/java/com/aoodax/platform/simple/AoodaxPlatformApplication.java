package com.aoodax.platform.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.aoodax.platform.simple")
public class AoodaxPlatformApplication {

    public static void main(final String[] args) {
        SpringApplication.run(AoodaxPlatformApplication.class, args);
    }
}
