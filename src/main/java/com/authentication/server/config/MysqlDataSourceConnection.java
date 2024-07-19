package com.authentication.server.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MysqlDataSourceConnection{

	@Bean
    @ConfigurationProperties("spring.datasource.mysql")
    public DataSourceProperties mysqlDataSourceProperties() {
        return new DataSourceProperties();
    }
	
	@Bean
	@Primary
	public DataSource mysqlDataSource() {
	    return mysqlDataSourceProperties()
	      .initializeDataSourceBuilder()
	      .build();
	}
}
