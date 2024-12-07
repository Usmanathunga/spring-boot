package com.example.entityMapping.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VegPizza implements Pizza {
    public String getPizza(){
        return "VegPizza";
    }
}
