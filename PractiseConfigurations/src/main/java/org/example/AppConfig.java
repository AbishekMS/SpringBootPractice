package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean(name = "customDieselEngine")
    public Engine dieselEngine() {
        return new DieselEngine();
    }
    @Bean(name="customPetrolEngine")
    //@Primary use this or Qualifier but Qualifier<Primary
    public Engine petrolEngine(){
        return new PetrolEngine();
    }

    @Bean
    public Car car(@Qualifier("customPetrolEngine") Engine engine) {
        return new Car(engine);
    }
}
