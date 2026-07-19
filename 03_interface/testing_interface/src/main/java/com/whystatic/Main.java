package com.whystatic;

public class Main {
    static void main() {

        ValidatorAfterJava8 validator = ValidatorAfterJava8.notNull();

        IO.println("Valid::" + validator.validate("Hello"));

        validator = ValidatorAfterJava8.notEmpty();
        IO.println("Valid::" + validator.validate("Hello"));

        Boolean isValidEmail = ValidatorAfterJava8.isValidEmail("hello@gmail.com");
        IO.println("Valid::" + isValidEmail);


    }
}
