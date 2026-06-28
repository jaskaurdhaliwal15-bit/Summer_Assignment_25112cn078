import java.util.HashMap;
import java.util.Scanner;

public class salarymanagment {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Salary> salaries = new HashMap<>();

    public static void main(String[] args) {

        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Salary Management Program");
            System.out.println("Choose one");
            System.out.println("1. Add salary record");
            System.out.println("2. Search salary record");
            System.out.println("3. Update salary record");
            System.out.println("4. Delete salary record");
            System.out.println("5. View all salary records");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> addSalary();
                case 2 -> searchSalary();
                case 3 -> updateSalary();
                case 4 -> deleteSalary();
                case 5 -> viewSalary();
                case 6 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void addSalary() {
        System.out.println("Enter salary information");

        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (salaries.containsKey(id)) {
            System.out.println("ID already exists");
            return;
        }

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Basic Salary: ");
        double basicSalary = sc.nextDouble();

        if (basicSalary < 0) {
            System.out.println("Invalid amount");
            return;
        }

        System.out.print("Bonus: ");
        double bonus = sc.nextDouble();

        if (bonus < 0) {
            System.out.println("Invalid amount");
            return;
        }

        System.out.print("Deduction: ");
        double deduction = sc.nextDouble();

        if (deduction < 0) {
            System.out.println("Invalid amount");
            return;
        }

        Salary s = new Salary(id, name, basicSalary, bonus, deduction);
        salaries.put(id, s);
        System.out.println("Salary record added!");
    }

    static void searchSalary() {
        System.out.print("Enter employee id number: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!salaries.containsKey(id)) {
            System.out.println("ID number does not exist");
            return;
        }

        Salary s = salaries.get(id);
        s.display();
    }

    static void deleteSalary() {
        System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!salaries.containsKey(id)) {
            System.out.println("Invalid ID");
            return;
        }

        System.out.print("Are you sure you want to delete salary record of " + id + " (yes/no): ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            salaries.remove(id);
            System.out.println("Salary record removed successfully.");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    static void viewSalary() {
        if (salaries.isEmpty()) {
            System.out.println("No salary records found");
            return;
        }

        for (Salary s : salaries.values()) {
            System.out.println("****************************************");
            s.display();
            System.out.println("****************************************");
        }
    }

    static void updateSalary() {
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!salaries.containsKey(id)) {
            System.out.println("Employee not found.");
            return;
        }

        Salary s = salaries.get(id);
        s.display();

        System.out.println("**********************");
        System.out.println("Update salary details");

        System.out.print("Enter new name: ");
        s.name = sc.nextLine();

        System.out.print("Enter new basic salary: ");
        s.basicSalary = sc.nextDouble();

        System.out.print("Enter new bonus: ");
        s.bonus = sc.nextDouble();

        System.out.print("Enter new deduction: ");
        s.deduction = sc.nextDouble();

        System.out.println("Salary record updated!");
    }
}
