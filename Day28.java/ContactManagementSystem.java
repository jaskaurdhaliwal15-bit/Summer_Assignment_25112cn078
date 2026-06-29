import java.util.HashMap;
import java.util.Scanner;

public class ContactManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Contact> contacts = new HashMap<>();

    public static void main(String[] args) {

        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Contact Management System");
            System.out.println("Choose one");
            System.out.println("1. Add contact");
            System.out.println("2. Search contact");
            System.out.println("3. Update contact");
            System.out.println("4. Delete contact");
            System.out.println("5. View all contacts");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> addContact();
                case 2 -> searchContact();
                case 3 -> updateContact();
                case 4 -> deleteContact();
                case 5 -> viewContacts();
                case 6 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static boolean isValidPhone(String phone) {
        return phone.matches("\\d{10}");
    }

    static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    static void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Contact already exists");
            return;
        }

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        if (!isValidPhone(phone)) {
            System.out.println("Invalid phone number. It should contain exactly 10 digits.");
            return;
        }

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (!isValidEmail(email)) {
            System.out.println("Invalid email address.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.put(name, c);
        System.out.println("Contact added successfully.");
    }

    static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if (!contacts.containsKey(name)) {
            System.out.println("Contact not found");
            return;
        }

        Contact c = contacts.get(name);
        c.display();
    }

    static void updateContact() {
        System.out.print("Enter name to update: ");
        String name = sc.nextLine();

        if (!contacts.containsKey(name)) {
            System.out.println("Contact not found");
            return;
        }

        Contact c = contacts.get(name);
        c.display();

        System.out.println("**********************");
        System.out.println("Update contact details");

        System.out.print("Enter new phone number: ");
        String phone = sc.nextLine();

        if (!isValidPhone(phone)) {
            System.out.println("Invalid phone number. It should contain exactly 10 digits.");
            return;
        }

        System.out.print("Enter new email: ");
        String email = sc.nextLine();

        if (!isValidEmail(email)) {
            System.out.println("Invalid email address.");
            return;
        }

        c.phone = phone;
        c.email = email;

        System.out.println("Contact updated successfully.");
    }

    static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();

        if (!contacts.containsKey(name)) {
            System.out.println("Contact not found");
            return;
        }

        System.out.print("Are you sure you want to delete this contact? (yes/no): ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            contacts.remove(name);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found");
            return;
        }

        for (Contact c : contacts.values()) {
            System.out.println("****************************************");
            c.display();
            System.out.println("****************************************");
        }
    }
}