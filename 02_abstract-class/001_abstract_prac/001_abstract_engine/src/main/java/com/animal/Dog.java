package com.animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        IO.println("Wof wof");
    }
}
