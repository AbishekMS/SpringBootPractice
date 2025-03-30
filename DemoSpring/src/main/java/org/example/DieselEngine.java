package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class DieselEngine implements Engine {
    DieselEngine(){
        System.out.println("DieselEngine constructor");
    }
    public void start(){
        System.out.println("DieselEngine");
    }
}
