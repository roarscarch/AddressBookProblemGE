package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void addContact() {
        System.out.println("Enter first and last name : ");
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println("Enter address : ");
        String address = sc.next();
        System.out.println("Enter city and state : ");
        String city = sc.next();
        String state = sc.next();
        System.out.println("Enter zip : ");
        int zipCode = sc.nextInt();
        System.out.println("Enter contact number : ");
        long mobileNo = sc.nextLong();
        System.out.println("Enter email id : ");
        String emailID = sc.next();

        contacts.add(new Contact(firstName, lastName, address, city, state, zipCode, mobileNo, emailID));

    }

    public void displayContact() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void editContact() {
        System.out.println("Enter person name : ");
        String name = sc.next();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name) || contact.getLastName().equals(name)) {
                System.out.println("What you want to edit : \n" + "1.first name \t" + "2.last name \t" + "3.address \t"
                        + "4.city \t" + "5.state \t" + "6.zipCode \t" + "7.contact number \t" + "8.emailID");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter first name :");
                        contact.setFirstName(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 2:
                        System.out.println("Enter last name :");
                        contact.setLastName(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 3:
                        System.out.println("Enter address :");
                        contact.setAddress(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 4:
                        System.out.println("Enter city :");
                        contact.setCity(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 5:
                        System.out.println("Enter state :");
                        contact.setState(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 6:
                        System.out.println("Enter zip code :");
                        contact.setZipCode(sc.nextInt());
                        System.out.println("Contact updated!");
                        break;
                    case 7:
                        System.out.println("Enter contact number :");
                        contact.setMobileNo(sc.nextLong());
                        System.out.println("Contact updated!");
                        break;
                    case 8:
                        System.out.println("Enter email :");
                        contact.setEmailID(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
                return;
            }
        }
        System.out.println(name + " not found!");
    }

    public void deleteContact() {
        System.out.println("Enter person name : ");
        String name = sc.next();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name) || contact.getLastName().equals(name)) {
                contacts.remove(contact);
                System.out.println(contact.getFirstName() + " removed!");
                return;
            }
        }
        System.out.println(name + " not found!");
    }

    public List<Contact> getContactList() {
        return contacts;
    }

}