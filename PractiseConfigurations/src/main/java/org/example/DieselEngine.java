package org.example;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;

public class DieselEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Diesel");
    }

}
