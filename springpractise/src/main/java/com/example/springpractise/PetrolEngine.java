package com.example.springpractise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class PetrolEngine implements Engine {

    public void start(){
        System.out.println("Petrol");
    }

}
