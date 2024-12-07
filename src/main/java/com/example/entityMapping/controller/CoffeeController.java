package com.example.entityMapping.controller;

public class CoffeeController {
    public String getCoffee(){
     return "getCoffee";
    }

    public void init(){
        System.out.println("Init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
