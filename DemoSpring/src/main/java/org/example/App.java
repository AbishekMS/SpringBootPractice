package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        /*PetrolEngine pe= (PetrolEngine) context.getBean("petrolEngine");
        pe.start();*/
        Car car= (Car) context.getBean("car");
        car.getEngine();
        System.out.println(car.getNumber());
        System.out.println(car.getOwner());




    }
}

