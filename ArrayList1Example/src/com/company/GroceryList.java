package com.company;

import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
public class GroceryList {

    // Creating private variable for ArrayList
    // We define the type of what items is going in ArrayList e.g below "ArrayList<String>"

        private ArrayList<String> groceryList = new ArrayList<String>();

        // Following methods are part of Array List class.

        public void addGroceryItem(String item) {
            groceryList.add(item); // Adding element
        }

        public void printGroceryList() { // groceryList.size() - determines how many elements are there in arraylist
            System.out.println("You have " + groceryList.size() + " items in your grocery list");
            for(int i=0; i< groceryList.size(); i++) {
                System.out.println((i+1) + ". " + groceryList.get(i));  // groceryList.get(i) is to access elements
                // (i+1) Counting starts from 1
            }
        }

        public void modifyGroceryItem(int position, String newItem) { // Method for Modifying or replacing elements
            groceryList.set(position, newItem); // .set() is used to replace new item
            System.out.println("Grocery item " + (position+1) + " has been modified.");
        }

        public void removeGroceryItem(int position) {
            String theItem = groceryList.get(position); // Get the position of item
            groceryList.remove(position);
        }
}

