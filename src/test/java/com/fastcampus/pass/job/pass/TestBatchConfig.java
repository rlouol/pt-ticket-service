package com.fastcampus.pass.job.pass;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@EntityScan("com.fastcampus.pass")
@EnableJpaRepositories("com.fastcampus.pass")
@EnableTransactionManagement
@EnableBatchProcessing
@EnableJpaAuditing
@Configuration
public class TestBatchConfig {
}
