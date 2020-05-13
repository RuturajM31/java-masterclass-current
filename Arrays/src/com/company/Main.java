package com.company;

public class Main {

    public static void main(String[] args) {

        // Creating an Array

        int[] myIntVariable; // Creating Array , tells Java compiler we are dealing with an array

        myIntVariable = new int[10]; // Assigning elements into an Array, this assigns 10 elements


        // or we can simply put in one line

        int[] myIntArray = new int[10]; // Creating 10 elements

        // Accessing individual Array elements

        myIntArray[5] = 50; // Saving the value 50 in element 6 because in Java the count starts at position 0

        // We can change the data type to double

        double[] myDoubleArray = new double[10]; // Creating 10 elements for type double

        // retrieve a value from a element
        System.out.println(myIntArray[5]);

        // Storing multiple values

        int[] myNewIntArray = {1,2,3,4,5,6,7,8,9,10};

        // Retrieving Values
        System.out.println(myNewIntArray[0]);
        System.out.println(myNewIntArray[6]);
        System.out.println(myNewIntArray[8]);

        // For loop to initialize an Array

        int[] forLoopArray = new int[10];

        for (int i= 0; i < 10 ; i++){
            forLoopArray[i] = i * 10; // Loop through ten numbers, initial i set to 0

            // E.g
            // forLoopArray[0] = 0 * 10 = 0
            // forLoopArray[1] = 1 * 10 = 10
            // forLoopArray[2] = 2 * 10 = 20 ... and so on

        }

        for(int i = 0 ; i < 10 ; i++){

            System.out.println("Element " + i + " value is " + forLoopArray[i]);
        }


        // Using For loop with length method instead of hardcoding values

        int[] myNewForLoop = new int[10];

        for ( int i = 0 ; i < myNewForLoop.length; i++){

            myNewForLoop[i]= i*10;

            System.out.println("New Element " + i + " value is " + myNewForLoop[i]);


            int[] myMethodArray = new int[50];
            myprintArray(myMethodArray);

        }
        // Creating Method to Pass Array and Call it

        public static void printArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println("Method Array Element " + i + " value is " + array[i]);
            }
        }

    }
}
