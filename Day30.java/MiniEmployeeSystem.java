import java.util.HashMap;
import java.util.Scanner;

public class MiniEmployeeSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Mini Employee System");
            System.out.println("1. Add employee");
            System.out.println("2. View employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployee();
                case 3 -> deleteEmployee();
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye!");
        sc.close();
    }

    static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (employees.containsKey(id)) {
            System.out.println("ID already exists");
            return;
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        employees.put(id, new Employee(id, name, salary));
        System.out.println("Employee added.");
    }

    static void viewEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!employees.containsKey(id)) {
            System.out.println("Employee not found");
            return;
        }

        employees.get(id).display();
    }

    static void deleteEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!employees.containsKey(id)) {
            System.out.println("Employee not found");
            return;
        }

        employees.remove(id);
        System.out.println("Employee deleted.");
    }
}
