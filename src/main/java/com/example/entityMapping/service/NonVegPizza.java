package com.example.entityMapping.service;

import org.springframework.stereotype.Component;
// annotation using configuration
@Component
public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "Non Veg Pizza";
    }
}
