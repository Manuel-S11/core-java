package com.engine;

public class DieselEngine extends Engine{

    public DieselEngine() {
        IO.println("\n==============================\n Diesel Engine \n==============================");
    }

    @Override
    public String startEngine() {
        return "Diesel Engine is Started";
    }
}
