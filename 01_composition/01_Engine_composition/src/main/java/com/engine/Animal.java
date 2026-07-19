package com.engine;

// Parent Class (Super Class)
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " စားနေသည်");
    }

    public void sleep() {
        System.out.println(name + " အိပ်နေသည်");
    }
}

// Child Class 1 - IS-A Relationship
class Dog extends Animal {        // Dog IS-A Animal
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " ဟောင်နေသည်");
    }

    // Method Overriding (Polymorphism)
    @Override
    public void eat() {
        System.out.println(name + " အရိုးစားနေသည်");
    }
}

// Child Class 2 - IS-A Relationship
class Cat extends Animal {        // Cat IS-A Animal
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + " မောင်းနေသည်");
    }
}

// Another level of Inheritance (Multi-level)
class Puppy extends Dog {         // Puppy IS-A Dog, Puppy IS-A Animal
    public Puppy(String name) {
        super(name);
    }

    public void weep() {
        System.out.println(name + " ငိုနေသည်");
    }
}

// Main Class မှ စမ်းသပ်ခြင်း
//class Main {
//    static void main() {
//
////        Car car = new Car();
////        car.setEngine(new DieselEngine());
////
////        car.readyToDrive("kIo_zt#R*n");
//
//        IO.println("=====================================================");
//        Animal myDog = new Dog("ရှင်သန်");
//        Animal myCat = new Cat("မယ်လီ");
//        Animal myPuppy = new Puppy("လုံလုံ");
//        Puppy puppy = (Puppy) myPuppy;
//
//        // IS-A Relationship ကို အသုံးပြုပြီး ခေါ်နိုင်တယ်
//        myDog.eat();      // Dog အတွက် override လုပ်ထားတဲ့ eat()
//        myDog.sleep();
//
//        myCat.eat();
//        myCat.sleep();
//
//        myPuppy.eat();
//        puppy.bark();
//        puppy.weep();
//
//        // Polymorphism ဥပမာ
//        System.out.println("\n--- Polymorphism ဥပမာ ---");
//        Animal[] animals = {myDog, myCat, myPuppy};
//        for (Animal animal : animals) {
//            animal.sleep();   // တူညီတဲ့ method ခေါ်ပေမယ့် မတူညီတဲ့ အလုပ်လုပ်တယ်
//        }
//    }
//}