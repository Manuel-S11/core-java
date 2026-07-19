package com.engine;

public class Car {


    private Engine engine;
    private final static String CAR_KEY = "kIo_zt#R*n";

    public Engine getEngine() {
        return engine;

    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void readyToDrive(String key){

        if(key.equals(CAR_KEY)){
            engine.startEngine();
            IO.println("Car is Ready to Drive");
        } else{
            throw new CarKeyInvalidException("Car key is Invalid");
        }

    }
}
