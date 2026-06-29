import java.util.HashMap;
import java.util.Scanner;

public class LibraryManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Book> books = new HashMap<>();

    public static void main(String[] args) {

        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Library Management Program");
            System.out.println("Choose one");
            System.out.println("1. Add a book");
            System.out.println("2. Search book");
            System.out.println("3. Update book");
            System.out.println("4. Delete book");
            System.out.println("5. View all books");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> addBook();
                case 2 -> searchBook();
                case 3 -> updateBook();
                case 4 -> deleteBook();
                case 5 -> viewBooks();
                case 6 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void addBook() {
        System.out.println("Enter book information");

        System.out.print("Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (books.containsKey(id)) {
            System.out.println("ID already exists");
            return;
        }

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        if (quantity < 0) {
            System.out.println("Invalid quantity");
            return;
        }

        Book b = new Book(id, title, author, quantity);
        books.put(id, b);
        System.out.println("Book added!");
    }

    static void searchBook() {
        System.out.print("Enter book id: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!books.containsKey(id)) {
            System.out.println("Book not found");
            return;
        }

        Book b = books.get(id);
        b.display();
    }

    static void updateBook() {
        System.out.print("Enter book id: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!books.containsKey(id)) {
            System.out.println("Book not found");
            return;
        }

        Book b = books.get(id);
        b.display();

        System.out.println("**********************");
        System.out.println("Update book details");

        System.out.print("Enter new title: ");
        b.title = sc.nextLine();

        System.out.print("Enter new author: ");
        b.author = sc.nextLine();

        System.out.print("Enter new quantity: ");
        b.quantity = sc.nextInt();

        System.out.println("Book updated!");
    }

    static void deleteBook() {
        System.out.print("Enter book id: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!books.containsKey(id)) {
            System.out.println("Invalid ID");
            return;
        }

        System.out.print("Are you sure you want to delete this book? (yes/no): ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            books.remove(id);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found");
            return;
        }

        for (Book b : books.values()) {
            System.out.println("****************************************");
            b.display();
            System.out.println("****************************************");
        }
    }
}
