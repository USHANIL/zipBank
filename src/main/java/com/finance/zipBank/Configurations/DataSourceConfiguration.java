package com.finance.zipBank.Configurations;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


import javax.sql.DataSource;

@Configuration
@Profile("cloud")
public class DataSourceConfiguration {

    @Value("postgres://vhfomuaoqeclkj:8029d108e1d847f3f939145dc7285d655749c298ebcbd3e2ef33205532f76288@ec2-174-129-33-107.compute-1.amazonaws.com:5432/da6mtsk3lvdcl6")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }

 /*
@Value("${spring.datasource.url}")
private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }

  */
}