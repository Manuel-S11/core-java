package com.engine;

public class PetroEngine extends Engine{

    public PetroEngine(){

        IO.println("\n==============================\n Petrol Engine \n==============================");
    }

    @Override
    public String startEngine() {
        return "Petrol Engine is Started";
    }


}
