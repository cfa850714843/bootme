package com.phigey.bootme.configuration;


import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * initialize service database
 *
 * @author lizf
 */

@Configuration
public class LiquibaseConfig {
    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase springLiquibase = new SpringLiquibase();
        springLiquibase.setDataSource(dataSource);
        springLiquibase.setChangeLog("classpath:db/db-init.xml");
        springLiquibase.setContexts("development,test,production");
        springLiquibase.setShouldRun(true);
        return springLiquibase;
    }
}
