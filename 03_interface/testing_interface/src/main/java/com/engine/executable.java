package com.engine;

import jdk.jfr.Timestamp;

public interface executable {

    public static final String code = "SIO-22";
    String executeInstance = "ObjectCaller";

    void caller1();
    public void callerAbstract();

    //static method
    public static void caller2(){}

    //default method
    default void defaultCaller(){
        // can use this keyword
        this.caller1();
        this.callerAbstract();
        this.caller4();
    }
    default String defaultCaller1(){
        return "";
    }


    //private method
    private static void caller3(){}
    private void caller4(){}


}
