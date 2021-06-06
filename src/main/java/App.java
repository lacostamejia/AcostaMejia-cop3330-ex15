/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 *
 */

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner method declared

        //These are variables that are going to be using
        String username;
        String password = "abc$123";
        String input_password;

        System.out.print("What is the username? ");
        username = in.next(); //Here we are inputting the username

        System.out.print("What is the password? ");
        input_password = in.next(); //Here we are inputting the the password.
        input_password = input_password.toLowerCase(); //Here convert it into lower case

        if(input_password.equals(password)){ //If the inputted password is the same as the password saved.
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you."); //Then if is not the same password; then we sent this message.
        }

    }
}
