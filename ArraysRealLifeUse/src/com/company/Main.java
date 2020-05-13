package com.company;

import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5); // Defining Array myIntegers
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    // We are going to create a method and it will allow to type 5 numbers
    // Return those 5 numbers and save them in myIntegers
    // The actual value from this method is passed back to int[] myIntegers


    public static int[] getIntegers(int number) { // Number is no. of elements we want to find in our array
        System.out.println("Enter " + number + " integer values.\r"); // \r is new line
        int[] values = new int[number]; // Defining array values

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values; // Return the value back to calling process in  int[] myIntegers
    }
    // Getting Average of the typed values

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length; // Return the value back to getAverage(myIntegers)

    }
}

