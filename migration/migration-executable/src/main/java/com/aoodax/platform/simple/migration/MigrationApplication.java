package com.aoodax.platform.simple.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.aoodax.platform.simple")
@PropertySource("classpath:migration-application.properties")
@SpringBootApplication
public class MigrationApplication {
    public static void main(final String[] args) {
        SpringApplication.run(MigrationApplication.class);
    }

}
