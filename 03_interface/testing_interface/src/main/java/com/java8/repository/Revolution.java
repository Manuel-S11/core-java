package com.java8.repository;

public interface Revolution {


    void start();
    void stop();


    //in java 8, interface allow to write public default method and public static method
    //because of adding the stream api in the collection framework

    public default void run(){
        IO.println("Vehicle Engine is start");
        start();
        stop();
    }

    public default void runInfo(){


        run();

    }

}
