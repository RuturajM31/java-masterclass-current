package com.company;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("7456-0098-8876");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter Action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...!");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    ;
                    System.out.println();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }

    }

    // Creating Methods for printActions

    // 1. Method for Add new contact

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine(); // Get name and got to next line
        System.out.println("Enter your phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added " + name + ", Phone: " + phone);
        } else {
            System.out.println("Cannot add " + name + ", already on file ");
        }

    }

    // 2. Method for UpdateContact

    private static void updateContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact name");
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found ");
            return;
        }
        System.out.println("Enter new name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error in updating Record");
        }
    }

    // 3. Removing Contact

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact name");
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found ");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {

            System.out.println("Error in deleting ");
        }

    }

    // 4. Querying contact method

    private static void queryContact() {
        System.out.println("Enter existing Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact name");
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found ");
            return;
        }

        System.out.println("Name " + existingContactRecord.getName() +
                "Phone Number is " + existingContactRecord.getPhoneNumber());


    }


        private static void startPhone () {
            System.out.println("Phone starting ....");
        }

        private static void printActions () {
            System.out.println("\nAvailable actions:\npress");
            System.out.println("0 - to shutdown\n" +
                    "1 - to print contacts\n" +
                    "2 - to add new contact\n" +
                    "3 - to update an existing contact\n" +
                    "4 - to remove an existing contact\n" +
                    "5 - to query if existing contact exists\n" +
                    "6 - to print a list of available actions\n");

            System.out.println("Choose your action: ");
        }

}

