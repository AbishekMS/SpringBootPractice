package com.example.springpractise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class DieselEngine implements Engine{
    public void start(){
        System.out.println("Diesel");
    }
}
