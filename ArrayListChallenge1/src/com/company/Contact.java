package com.company;

public class Contact {

    // Setting fields

    private String name;
    private String phoneNumber;

    // Creating constructor

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    // Creating only getters


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // To create public static method to create a new contact record
    // This will be useful while functions are built into the phone

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber); // Calling the constructor to create a new contact

    }

}
