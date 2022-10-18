package com.example.apiencryption.config.web;

import com.example.apiencryption.config.secret.SecretFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.Filter;

/**
 * @author null
 */
@Configuration
public class WebConfig {

    public static final String SECRET_PREFIX = "/secret";

    @Bean
    public Filter secretFilter() {
        return new SecretFilter();
    }


    @Bean
    public FilterRegistrationBean<DelegatingFilterProxy> filterRegistration() {
        FilterRegistrationBean<DelegatingFilterProxy> registration = new FilterRegistrationBean<>();
        registration.setFilter(new DelegatingFilterProxy("secretFilter"));
        registration.setName("secretFilter");
        registration.addUrlPatterns(SECRET_PREFIX + "/*");
        registration.setOrder(1);
        return registration;
    }
}