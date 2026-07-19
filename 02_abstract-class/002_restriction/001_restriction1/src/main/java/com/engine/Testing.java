package com.engine;

public class Testing {


    private String name;
    private int age;
    private String email;
    private static String location;


    public static void test1(){

        // location is the static, that's why can use directly
        IO.println(Testing.location);
        Testing test = new Testing();
        IO.println(test.name);
        IO.println(test.age);
        IO.println(test.email);


    }

    public void test2(){

        IO.println(location);
        IO.println(name);
        IO.println(age);
        IO.println(email);
    }
}
