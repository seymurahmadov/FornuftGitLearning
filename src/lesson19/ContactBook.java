package lesson19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    private Map<String, String> contacts;

    public ContactBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            System.out.println("Contact name already exists. Updating the phone number.");
        }
        contacts.put(name, phoneNumber);
        System.out.println("Contact added/updated successfully.");
    }

    public void removeContact(String name) {
        if (contacts.remove(name) != null) {
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchContact(String name) {
        String phoneNumber = contacts.get(name);
        if (phoneNumber != null) {
            System.out.println("Contact found: " + name + " - " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("All Contacts:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();
        int choice;

        do {
            System.out.println("\nContact Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contactBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter contact name to remove: ");
                    name = scanner.nextLine();
                    contactBook.removeContact(name);
                    break;
                case 3:
                    System.out.print("Enter contact name to search: ");
                    name = scanner.nextLine();
                    contactBook.searchContact(name);
                    break;
                case 4:
                    contactBook.displayAllContacts();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
