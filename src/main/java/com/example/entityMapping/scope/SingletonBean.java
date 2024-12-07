package com.example.entityMapping.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)// by default singleton
public class SingletonBean {
    public SingletonBean(){
        System.out.println("SingletonBean");
    }
    }
