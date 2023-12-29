package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to address book computation program");

        Scanner sc = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("0.Exit \n1.Add Contact \n2.Display Contact \n3.Edit ");
            System.out.println("Enter the Operation Number : ");
            int operationNumber = sc.nextInt();

            switch (operationNumber) {

                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}