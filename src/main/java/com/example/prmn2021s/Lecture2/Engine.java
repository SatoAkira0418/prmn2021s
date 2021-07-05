package com.example.prmn2021s.Lecture2;

public class Engine {
    int rpm;

    Engine(int rpm){
        this.rpm = rpm;
    }

    void start(){
        System.out.println("rpm=" + rpm + " エンジンを始動させました。");
    }
}
