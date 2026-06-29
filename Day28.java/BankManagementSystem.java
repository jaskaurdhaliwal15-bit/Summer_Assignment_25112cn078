import java.util.HashMap;
import java.util.Scanner;

public class BankManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) {

        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Bank Account System");
            System.out.println("Choose one");
            System.out.println("1. Create account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Delete account");
            System.out.println("6. View all accounts");
            System.out.println("7. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> checkBalance();
                case 5 -> deleteAccount();
                case 6 -> viewAccounts();
                case 7 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void createAccount() {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (accounts.containsKey(id)) {
            System.out.println("ID already exists");
            return;
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Invalid balance");
            return;
        }

        BankAccount account = new BankAccount(id, name, balance);
        accounts.put(id, account);
        System.out.println("Account created successfully.");
    }

    static void depositMoney() {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!accounts.containsKey(id)) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        accounts.get(id).deposit(amount);
    }

    static void withdrawMoney() {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!accounts.containsKey(id)) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        accounts.get(id).withdraw(amount);
    }

    static void checkBalance() {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!accounts.containsKey(id)) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("Current Balance: " + accounts.get(id).balance);
    }

    static void deleteAccount() {
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!accounts.containsKey(id)) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Are you sure you want to delete this account? (yes/no): ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            accounts.remove(id);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    static void viewAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        for (BankAccount account : accounts.values()) {
            System.out.println("****************************************");
            account.display();
            System.out.println("****************************************");
        }
    }
}
