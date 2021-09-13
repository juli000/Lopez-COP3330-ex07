/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is the length of the room in feet?" );
        Scanner s = new Scanner(System.in);
        String length = s.nextLine();
        System.out.println("What is the width of the room in feet?");
        String width = s.nextLine();
        Integer i = Integer.valueOf(length);
        Integer j = Integer.valueOf(width);
        System.out.println("You entered dimensions of " + i + "feet by " + j + "feet.");
        double m = (i*j)/3.281;
        System.out.println("The area is \n" + (i * j) + "square feet\n" + m + "square meters.");
    }
}
