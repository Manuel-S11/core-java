package com.engine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        IO.println("Hello Abstraction");

        Car car = new Car();
        car.setEngine(new ElectricEngine());

        car.readyToDrive("kIo_zt#R*n");
    }
}
