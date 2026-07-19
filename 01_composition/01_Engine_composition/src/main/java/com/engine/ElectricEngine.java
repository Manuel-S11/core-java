package com.engine;

public class ElectricEngine extends Engine{

    public ElectricEngine() {

        IO.println("\n==============================\n Electric Engine \n==============================");
    }

    @Override
    protected void startEngine() {
        IO.println("Electric Engine is Started");
    }
}
