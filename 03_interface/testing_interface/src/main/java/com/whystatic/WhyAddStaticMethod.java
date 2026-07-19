package com.whystatic;

import javax.xml.validation.Validator;
import java.util.Optional;

public interface WhyAddStaticMethod {

    // before Java 8 static method isn't allowed in interface
    // but after lunched java 8, static method is allowed in interface

    Optional<String> validate(String data);

// String validateEmail(String email);

}

// Utility Class
// Utility class is a class that contains static methods and constants
// Utility class is not a class that contains instance variables and methods
// Utility class is not a class that contains constructor
// Utility class is not a class that extends another class
// Utility class is not a class that implements an interface
class ValidatorUtils {


    private ValidatorUtils(){}

    public static WhyAddStaticMethod notNull(){

//        return data -> String.valueOf(data != null);
        return data -> data != null ? Optional.of("Valid") : Optional.of("Invalid Data");
    }

    public static boolean isValidEmail(String email) {

        return email != null && email.endsWith("@gmail.com");
    }

    static void main() {
        WhyAddStaticMethod mm = data->
                Optional.of("Valid::".concat(String.valueOf(data !=  null)));
    }


}

//after Java 8
@FunctionalInterface
interface ValidatorAfterJava8{

    boolean validate(String data);

    static boolean isValidEmail(String email) {
        return email != null && email.endsWith("@gmail.com");
    }

    static ValidatorAfterJava8 notNull(){

        return data -> null != data;
    }

    static ValidatorAfterJava8 notEmpty() {

        return data -> {
            return data != null && !data.isEmpty();
        };
    }

}