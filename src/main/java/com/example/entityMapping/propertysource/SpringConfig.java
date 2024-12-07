package com.example.entityMapping.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:mail.properties")
//@PropertySource("classpath:message.properties")
// we can use both way
@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:message.properties")
})
public class SpringConfig {
}
