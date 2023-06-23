package com.bl.regex;

import java.util.regex.*;
public class UserRegistration {
    public static void main( String[] args ) {
        System.out.println(firstName("Ganesh"));
        System.out.println(lastName("Pawar"));
        System.out.println(eMail("Ganesh02@gmail.com"));
    }
    // validate first name
    public static boolean firstName( String firstName ) {
        return firstName.matches( "[A-Z][a-z]{3,}" );
    }
    // validate last name
    public static boolean lastName( String lastName ) {
        return lastName.matches( "[A-Z][a-z]{3,}" );
    }
    //validate Email
    public static boolean eMail(String eMail){
        return eMail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}