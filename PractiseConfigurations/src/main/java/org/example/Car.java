package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(Engine e){
         engine=e;
    }
    public void getStart(){
        engine.start();
    }

}
