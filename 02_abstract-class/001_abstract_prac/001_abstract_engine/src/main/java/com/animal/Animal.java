package com.animal;

public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    abstract void makeSound();     // Abstract Method

    public void eat() {            // Concrete Method
        System.out.println(name + " is eating something");
    }
}
