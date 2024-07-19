package com.authentication.server.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PostgresqlDataSourceConnection {

	@Bean
	@ConfigurationProperties("spring.datasource.postgresql")
	public DataSourceProperties postgresqlDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	public DataSource postgresqlDataSource() {
		return postgresqlDataSourceProperties()
				.initializeDataSourceBuilder()
				.build();
	}

}
