package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Car c=context.getBean(Car.class);
        c.getStart();
    }
}
/*  This is Bean based configuration using Constructor Injection
No @Component, @Autowired, or @Service annotations. Instead, dependencies are defined explicitly in @Configuration class (AppConfig).

No setter injection or field injection. Constructor injection is used via @Bean methods in AppConfig.

Spring Container Handles Object Creation Automatically: Car is created with DieselEngine automatically injected.

PROs:
Explicit control over beans (no automatic scanning, clear configuration).
Decoupling: AppConfig allows different configurations (e.g., switching between DieselEngine and PetrolEngine easily).
Unit Testing: Easier to test since dependencies are manually injected.

CONs:
More boilerplate code (compared to using @Component and @Autowired).
Manual bean registration is needed in @Configuration

 */