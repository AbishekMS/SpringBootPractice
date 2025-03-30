package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Car {
    private Engine engine;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private int number;
    private String owner;
    public Car(Engine engine){
        this.engine=engine;
    }
    public void setNumber(int num){
        number=num;
    }

    public void getEngine(){
        engine.start();
    }
    public int getNumber(){
        return number;
    }
}
