package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Creating Scanner

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5); // Creating Integer Array
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);


    }

    // Creating getInteger() method

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity]; // Defining new array "array"
        System.out.println("Enter " + capacity + " integer values \r");
        for(int i = 0; i < array.length; i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    // Creating Print Array Method - Accept Array and Print Numbers

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Elements " + i + " contents " + array[i]);

        }

    }

    // Creating method for Sorting the Integers

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length]; // Creating array for sortedArray variable
//        for(int i = 0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }
        // Alternate method to create sorted array through builtin Java Method
        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while(flag){ // Going to loop until flag is true
            flag = false;
            // element 0  50
            // element 1  160
            // element 2  40

            // Always starting at element i = 0, ending element is 1 less than total (sortedArray.length -1)
            for(int i = 0; i < sortedArray.length - 1; i++){

                // if sortedArray[i] at element 0 is less than sortedArray[i+1] at next element
                // Number in next element is higher than first element, so we need to swap them
                if(sortedArray[i] < sortedArray[i+1]){

                    temp=sortedArray[i]; // We store the value of sortedArray in temp
                    sortedArray[i]= sortedArray[i+1]; // Move the above element in sortedArray[i+1] position
                    sortedArray[i+1]=temp; // Store value back to temp
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}
