import java.util.HashMap;
import java.util.Scanner;

public class marksheetManagment {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Marksheet> students = new HashMap<>();

    public static void main(String[] args) {

        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Marksheet Management Program");
            System.out.println("Choose one");
            System.out.println("1. Add student marksheet");
            System.out.println("2. Search marksheet");
            System.out.println("3. Update marksheet");
            System.out.println("4. Delete marksheet");
            System.out.println("5. View all marksheets");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> addMarksheet();
                case 2 -> searchMarksheet();
                case 3 -> updateMarksheet();
                case 4 -> deleteMarksheet();
                case 5 -> viewMarksheet();
                case 6 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void addMarksheet() {
        System.out.println("Enter student information");

        System.out.print("Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (students.containsKey(id)) {
            System.out.println("ID already exists");
            return;
        }

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("English marks: ");
        int english = sc.nextInt();

        System.out.print("Math marks: ");
        int math = sc.nextInt();

        System.out.print("Science marks: ");
        int science = sc.nextInt();

        System.out.print("Hindi marks: ");
        int hindi = sc.nextInt();

        System.out.print("Computer marks: ");
        int computer = sc.nextInt();

        if (english < 0 || math < 0 || science < 0 || hindi < 0 || computer < 0) {
            System.out.println("Invalid marks");
            return;
        }

        Marksheet m = new Marksheet(id, name, english, math, science, hindi, computer);
        students.put(id, m);
        System.out.println("Marksheet added!");
    }

    static void searchMarksheet() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!students.containsKey(id)) {
            System.out.println("ID does not exist");
            return;
        }

        Marksheet m = students.get(id);
        m.display();
    }

    static void deleteMarksheet() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!students.containsKey(id)) {
            System.out.println("Invalid ID");
            return;
        }

        System.out.print("Are you sure you want to delete this marksheet? (yes/no): ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            students.remove(id);
            System.out.println("Marksheet removed successfully.");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    static void viewMarksheet() {
        if (students.isEmpty()) {
            System.out.println("No marksheets found");
            return;
        }

        for (Marksheet m : students.values()) {
            System.out.println("****************************************");
            m.display();
            System.out.println("****************************************");
        }
    }

    static void updateMarksheet() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!students.containsKey(id)) {
            System.out.println("Student not found.");
            return;
        }

        Marksheet m = students.get(id);
        m.display();

        System.out.println("**********************");
        System.out.println("Update marksheet");

        System.out.print("Enter new name: ");
        m.name = sc.nextLine();

        System.out.print("Enter new English marks: ");
        m.english = sc.nextInt();

        System.out.print("Enter new Math marks: ");
        m.math = sc.nextInt();

        System.out.print("Enter new Science marks: ");
        m.science = sc.nextInt();

        System.out.print("Enter new Hindi marks: ");
        m.hindi = sc.nextInt();

        System.out.print("Enter new Computer marks: ");
        m.computer = sc.nextInt();

        System.out.println("Marksheet updated!");
    }
}