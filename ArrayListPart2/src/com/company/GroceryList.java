package com.company;

import java.util.ArrayList;

public class GroceryList {

    // Creating private variable for ArrayList
    // We define the type of what items is going in ArrayList e.g below "ArrayList<String>"

    private ArrayList<String> groceryList = new ArrayList<String>();

    // Following methods are part of Array List class.

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        // groceryList.size() - determines how many elements are there in arraylist
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            // (i+1) Counting starts from 1
            System.out.println((i+1) + ". " + groceryList.get(i));  // groceryList.get(i) is to access elements
        }
    }

    // Method for Modifying or replacing elements
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); // .set() is used to replace new item
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position); // Get the position of item
        groceryList.remove(position); // .get() to remove the item
    }

    // Method to find items

    public String findItem(String searchItems){
        // Use for loops and go through each index entry and compare it
        // or
        // use built in Java class .contain() to search the item
        boolean exists = groceryList.contains(searchItems); // Returns true if item is found

        // Return the item that's in the grocery list - using index function
        // Searches the items for you in the arraylist and pass the item you have passed
        // And return index position of arraylist of that item
        int position = groceryList.indexOf(searchItems);

        if(position >= 0){ // if position greater equal than 0
            return groceryList.get(position); // return the position
        }

        return null; // otherwise return null.


    }
}
