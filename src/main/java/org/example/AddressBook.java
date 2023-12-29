package org.example;

import java.util.*;

public class AddressBook {
    // INSTANT OBJECT
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    public void addContact() {

        Contact contact = new Contact();

        System.out.println("Enter the First Name : ");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address: ");
        contact.setAddress(sc.next());
        System.out.println("Enter the City : ");
        contact.setCity(sc.next());
        System.out.println("Enter the State : ");
        contact.setState(sc.next());
        System.out.println("Enter the Zip code : ");
        contact.setZipCode(sc.nextInt());
        System.out.println("Enter the Mobile Number : ");
        contact.setMobileNo(sc.nextInt());
        System.out.println("Enter the Email ID : ");
        contact.setEmailID(sc.next());

        contactArrayList.add(contact);
    }

    public void displayContact() {

        for (int i = 0; i < contactArrayList.size(); i++) {
            Contact contact = contactArrayList.get(i); // local object
            System.out.println(contact.toString());
        }

    }

    public void editContact(){
        System.out.println("Enter person name : ");
        String name = sc.next();
        for(Contact contact : contactArrayList){
            if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
                System.out.println("What you want to edit : \n" +
                        "1.first name \t" +
                        "2.last name \t" +
                        "3.address \t" +
                        "4.city \t" +
                        "5.state \t" +
                        "6.zipcode \t" +
                        "7.moblie number \t" +
                        "8.emailID");
                int ch = sc.nextInt();
                switch (ch){
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
                        System.out.println("Enter street :");
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
                        contact.setMobileNo(sc.nextInt());
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
        System.out.println("Enter the First Name to DELETE from address book : ");
        String FirstName = (sc.next());
        boolean IsAvaible = false;

        for (Contact contact : contactArrayList) {
            if (contact.getFirstName().equalsIgnoreCase(FirstName)) {
                IsAvaible = true;
                contactArrayList.remove(contact);
                System.out.println("CONTACT IS DELETED");
                break;
            }
        }
        if (IsAvaible == false) {
            System.out.println("CONTACT NOT AVAIBLE");
        }
    }
}