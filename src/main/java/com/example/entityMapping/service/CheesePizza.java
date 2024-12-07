package com.example.entityMapping.service;

import org.springframework.stereotype.Service;

// java base using configuration
// no need to add annotation
public class CheesePizza implements Pizza {
    @Override
    public String getPizza() {
        return "Cheese Pizza";
    }
}
