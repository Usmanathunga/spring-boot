package com.example.entityMapping.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String hello(){
        return "Hello repository";
    }
}
