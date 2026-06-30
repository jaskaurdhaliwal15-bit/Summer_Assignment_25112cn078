import java.util.HashMap;
import java.util.Scanner;

public class MiniLibrarySystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Book> books = new HashMap<>();

    public static void main(String[] args) {

        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Mini Library System");
            System.out.println("Choose one");
            System.out.println("1. Add book");
            System.out.println("2. Search book");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("5. View all books");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> addBook();
                case 2 -> searchBook();
                case 3 -> borrowBook();
                case 4 -> returnBook();
                case 5 -> viewBooks();
                case 6 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void addBook() {
        System.out.print("Enter book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (books.containsKey(id)) {
            System.out.println("ID already exists");
            return;
        }

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        if (quantity < 0) {
            System.out.println("Invalid quantity");
            return;
        }

        Book b = new Book(id, title, author, quantity);
        books.put(id, b);
        System.out.println("Book added successfully.");
    }

    static void searchBook() {
        System.out.print("Enter book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!books.containsKey(id)) {
            System.out.println("Book not found");
            return;
        }

        books.get(id).display();
    }

    static void borrowBook() {
        System.out.print("Enter book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!books.containsKey(id)) {
            System.out.println("Book not found");
            return;
        }

        Book b = books.get(id);

        if (b.quantity > 0) {
            b.quantity--;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("No copies available.");
        }
    }

    static void returnBook() {
        System.out.print("Enter book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!books.containsKey(id)) {
            System.out.println("Book not found");
            return;
        }

        Book b = books.get(id);
        b.quantity++;
        System.out.println("Book returned successfully.");
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
