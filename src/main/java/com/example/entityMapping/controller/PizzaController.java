package com.example.entityMapping.controller;

import com.example.entityMapping.service.Pizza;
import com.example.entityMapping.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
@Component("pizzaDemo")
public class PizzaController {

//    @Autowired // field injection
//    private VegPizza vegPizza;

    private Pizza pizza;


    //constructor injection
//    @Autowired
//    public PizzaController (VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }

//        @Autowired
//    public PizzaController (@Qualifier("nonVegPizza") Pizza pizza){
//        this.pizza = pizza;
//    }


    // when user primary annotation for service
    @Autowired
    public PizzaController (Pizza pizza){
        this.pizza = pizza;
    }


    //setter injection
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }

    public String getPizza(){
        return pizza.getPizza();
    }
}
