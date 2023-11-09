package com.aoodax.platform.simple.migration.conf;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@EnableMongock
@Configuration
@ComponentScan(basePackages = {"com.aoodax.platform.simple.migration"})
public class MigrationConfiguration {

    @ConditionalOnProperty(value = "mongock.transaction-enabled", havingValue = "true")
    @Bean
    public PlatformTransactionManager transactionManager(final MongoDatabaseFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }
}