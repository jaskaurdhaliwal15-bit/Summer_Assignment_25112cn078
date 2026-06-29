import java.util.HashMap;
import java.util.Scanner;

public class InventoryManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Product> products = new HashMap<>();
    static final int LOW_STOCK_LIMIT = 5;

    public static void main(String[] args) {
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Inventory Management System");
            System.out.println("Choose one");
            System.out.println("1. Add product");
            System.out.println("2. Search product");
            System.out.println("3. Update product");
            System.out.println("4. Delete product");
            System.out.println("5. View all products");
            System.out.println("6. Stock in");
            System.out.println("7. Stock out");
            System.out.println("8. Low stock alert");
            System.out.println("9. View total stock value");
            System.out.println("10. View total profit");
            System.out.println("11. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> searchProduct();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 5 -> viewProducts();
                case 6 -> stockIn();
                case 7 -> stockOut();
                case 8 -> lowStockAlert();
                case 9 -> viewTotalStockValue();
                case 10 -> viewTotalProfit();
                case 11 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void addProduct() {
        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (products.containsKey(id)) {
            System.out.println("ID already exists");
            return;
        }

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter cost price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        if (quantity < 0 || costPrice < 0 || sellingPrice < 0) {
            System.out.println("Invalid input");
            return;
        }

        Product p = new Product(id, name, quantity, costPrice, sellingPrice);
        products.put(id, p);
        System.out.println("Product added successfully.");
    }

    static void searchProduct() {
        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!products.containsKey(id)) {
            System.out.println("Product not found");
            return;
        }

        products.get(id).display();
    }

    static void updateProduct() {
        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!products.containsKey(id)) {
            System.out.println("Product not found");
            return;
        }

        Product p = products.get(id);
        p.display();

        System.out.println("**********************");
        System.out.println("Update product details");

        System.out.print("Enter new name: ");
        p.name = sc.nextLine();

        System.out.print("Enter new quantity: ");
        p.quantity = sc.nextInt();

        System.out.print("Enter new cost price: ");
        p.costPrice = sc.nextDouble();

        System.out.print("Enter new selling price: ");
        p.sellingPrice = sc.nextDouble();

        System.out.println("Product updated successfully.");
    }

    static void deleteProduct() {
        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!products.containsKey(id)) {
            System.out.println("Invalid ID");
            return;
        }

        System.out.print("Are you sure you want to delete this product? (yes/no): ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            products.remove(id);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    static void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products found");
            return;
        }

        for (Product p : products.values()) {
            System.out.println("****************************************");
            p.display();
            System.out.println("****************************************");
        }
    }

    static void stockIn() {
        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!products.containsKey(id)) {
            System.out.println("Product not found");
            return;
        }

        System.out.print("Enter quantity to add: ");
        int qty = sc.nextInt();

        if (qty <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        products.get(id).quantity += qty;
        System.out.println("Stock updated successfully.");
    }

    static void stockOut() {
        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!products.containsKey(id)) {
            System.out.println("Product not found");
            return;
        }

        System.out.print("Enter quantity to remove: ");
        int qty = sc.nextInt();

        if (qty <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        Product p = products.get(id);

        if (qty > p.quantity) {
            System.out.println("Not enough stock available");
            return;
        }

        p.quantity -= qty;
        System.out.println("Stock updated successfully.");
    }

    static void lowStockAlert() {
        boolean found = false;

        for (Product p : products.values()) {
            if (p.quantity <= LOW_STOCK_LIMIT) {
                System.out.println("Low stock alert: " + p.name + " | Quantity: " + p.quantity);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No low stock products.");
        }
    }

    static void viewTotalStockValue() {
        double total = 0;

        for (Product p : products.values()) {
            total += p.totalStockValue();
        }

        System.out.println("Total Stock Value = " + total);
    }

    static void viewTotalProfit() {
        double total = 0;

        for (Product p : products.values()) {
            total += p.totalProfit();
        }

        System.out.println("Total Profit = " + total);
    }
}
