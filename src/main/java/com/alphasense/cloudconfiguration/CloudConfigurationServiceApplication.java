package com.alphasense.cloudconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories
public class CloudConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigurationServiceApplication.class, args);
	}

}
