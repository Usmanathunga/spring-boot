package com.example.entityMapping.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // spring container create this bean at on demand
public class LazyLoader {
    public LazyLoader(){
        System.out.println("LazyLoader");
    }
}
