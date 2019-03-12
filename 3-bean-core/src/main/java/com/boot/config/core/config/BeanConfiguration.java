package com.boot.config.core.config;


import com.boot.config.core.domain.Order;
import com.boot.config.core.domain.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Order createOrder() {
        return new Order();
    }

    @Bean
    public Product createProduct() {
        return new Product();
    }
}
