package org.example;

import org.springframework.stereotype.Component;

public class PetrolEngine implements  Engine{
    @Override
    public void start(){
        System.out.println("Petrol");
    }
}