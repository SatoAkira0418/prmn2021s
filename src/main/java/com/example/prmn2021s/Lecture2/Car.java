package com.example.prmn2021s.Lecture2;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;

    Car(Tire[] tire,Engine engine){
        //this.fuel = fuel;
        this.fuel = 0;
        this.tires = tire;
        this.engine = engine;
    }

    void run(){
        if (fuel > 0) {
            fuel = fuel - 1;
            System.out.println("燃料を1消費して走りました。");
        }else if (fuel <= 0){
            System.out.println("燃料がないので走れません");
        }
    }

    void startEngine(){
        engine.start();
    }
}
