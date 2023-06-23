package com.bl.regex;

import java.util.regex.*;
public class UserRegistration {
    public static void main( String[] args ) {
        System.out.println(firstName("Tom"));

    }
    // validate first name
    public static boolean firstName( String firstName ) {
        return firstName.matches( "[A-Z][a-z]*" );
    }

}