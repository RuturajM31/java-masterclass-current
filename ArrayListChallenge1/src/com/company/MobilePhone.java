package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    // Creating constructor

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>(); // Initializing ArrayList with Empty List
    }

    // Creating Methods

    // 1. Add new contact method - If the contact was added successfully

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }
    // Update Contact Method
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        } else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                    "Already exists!!");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;

    }

    // Remove Contact Method

    public  boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted ");
        return true;

    }


    // Implement find contact method
    // Creating two find contact method
    // One method returns the index position - returns an Integer
    // Second returns

    // Find contact method - 1 (Index Position - return Integer)

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    // Find contact method - 2 (Contact name - return name) // Return String

    private int findContact(String contactName){
        //Loop through all records and extract the name out and compare the name that has been passed
        // return the index position if is on the file
        for (int i = 0 ; i < this.myContacts.size() ; i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }

        }
        return -1;

    }

    // Method - Query Contact

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }

        return null;

    }

    // For Update contact in Main method . Getting position based on the name

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position > 0) { // If found an entry
            return this.myContacts.get(position);
        }
        return null;

    }

    // For printContact() method in Main method (Mention under case only)

    public void printContacts(){
        System.out.println("Contact List");
        for(int i = 0; i<this.myContacts.size(); i++){
            System.out.println((i+1) + "." +
                               this.myContacts.get(i).getName() + " -> " +
                               this.myContacts.get(i).getPhoneNumber());
        }
    }



}
