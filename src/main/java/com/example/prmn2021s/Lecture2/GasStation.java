package com.example.prmn2021s.Lecture2;

public class GasStation {

    void refuel(Car car){
        car.fuel = car.fuel + 20;
        System.out.println("20給油しました。");
    }
}
