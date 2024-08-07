package file_IO_Serialization.file_IO.addressBookApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private static final String FILE_PATH = "contacts.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact(scanner);
                    break;
                case 4:
                    deleteContact(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(name + ", " + phone + ", " + email);
            writer.newLine();
            System.out.println("Contact added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void viewContacts() {
        File file = new File(FILE_PATH);
        if(!file.exists() || file.length() == 0) {
            System.out.println("Sorry! Address Book is empty. Please add contact.[0]");
            return;
        }

        boolean hasContacts = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("Contacts: ");
            while ((line = reader.readLine()) != null) {
                String[] contact = line.split(",");
                if (contact.length == 3) {
                    System.out.println("Name: " + contact[0] + " Phone: " + contact[1] + " Email: " + contact[2]);
                    hasContacts = true;
                } else {
                    System.out.println("Invalid contact format: "+line);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
        if (!hasContacts) {
            System.out.println("Sorry! Address Book is empty. Please add contact.[1]");
        }
    }

    private static void updateContact(Scanner scanner) {
        System.out.print("Enter name of the contact to update: ");
        String nameToUpdate = scanner.nextLine();

        List<String> contacts = new ArrayList<>();
        boolean found = false;

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println("Line: "+line);
                String[] contact = line.split(",");
                if (contact.length == 3 && contact[0].equals(nameToUpdate)) {
                    System.out.println("Enter new phone: ");
                    String newPhone = scanner.nextLine();
                    System.out.println("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    contacts.add(contact[0]+ ","+newPhone+","+newEmail);
                    found = true;
                } else {
                    contacts.add("Add Line: "+line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (found) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                for (String contact : contacts) {
                    writer.write(contact);
                    writer.newLine();
                }
                System.out.println("Contact updated successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Contact not found.");
        }
    }
    private static void deleteContact(Scanner scanner) {
        System.out.print("Enter name of the contact to delete: ");
        String nameToDelete = scanner.nextLine();

        List<String> contacts = new ArrayList<>();
        boolean found = false;

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] contact = line.split(",");
                if (contact.length == 3 && contact[0].equals(nameToDelete)) {
                    found = true;
                } else {
                    contacts.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (found) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                for (String contact : contacts) {
                    writer.write(contact);
                    writer.newLine();
                }
                System.out.println("Contact deleted successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Contact not found.");
        }
    }

}
