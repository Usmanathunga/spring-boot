package com.example.entityMapping.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertysourceDemo {

    @Autowired
    private Environment environment;

    @Value("${gmail.host}")
    private String host;
    @Value("${gmail.email}")
    private String email;
    @Value("${gmail.password}")
    private String password;

//    @Value("${message.name}")
    private String name;// we can get value using environment annonimus object

    public String getName() {
        return environment.getProperty("message.name");
    }

    public String getDesc() {
        return desc;
    }

    @Value("${message.description}")
    private String desc;

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
