//package com.example.demo.config;
//
//import dev.miku.r2dbc.mysql.MySqlConnectionConfiguration;
//import dev.miku.r2dbc.mysql.MySqlConnectionFactory;
//import io.r2dbc.spi.ConnectionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConnectionFactoryConfiguration {
//    @Bean
//    public ConnectionFactory connectionFactory() {
//        return MySqlConnectionFactory.from(MySqlConnectionConfiguration.builder()
//                .host("localhost")
//                .port(3306)
//                .username("root")
//                .password("root")
//                .database("r2dbc")
//                .build());
//    }
//}
