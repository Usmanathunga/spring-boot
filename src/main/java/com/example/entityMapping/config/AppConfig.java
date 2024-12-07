package com.example.entityMapping.config;

import com.example.entityMapping.controller.CoffeeController;
import com.example.entityMapping.service.CheesePizza;
import com.example.entityMapping.service.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
//    @Bean
//    public Pizza cheesePizza(){
//        return new CheesePizza();
//    }


    @Bean(name = "cheeseBean")
    public Pizza cheesePizza(){
       return new CheesePizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public CoffeeController coffeeController(){
        return new CoffeeController();
    }
}
