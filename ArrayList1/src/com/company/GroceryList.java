package com.company;

import java.util.ArrayList;

/**
 * Created by dev on 23/08/15.
 */
public class GroceryList {

    // Creating private variable for ArrayList
    // We define the type of what items is going in ArrayList e.g below "ArrayList<String>"

    private ArrayList<String> groceryList = new ArrayList<String>(); // elements are of String type

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
}

