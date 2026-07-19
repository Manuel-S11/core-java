package com.engine;

public class ElectricEngine extends Engine{

    public ElectricEngine() {

        IO.println("\n==============================\n Electric Engine \n==============================");
    }

    @Override
    public String startEngine() {
        return  "Electric Engine is Started";
    }
}
