import java.util.Scanner;

public class StudentRecordManagementSystem {
    static Scanner sc = new Scanner(System.in);

    static int[] ids = new int[100];
    static String[] names = new String[100];
    static int[] ages = new int[100];
    static String[] courses = new String[100];
    static double[] grades = new double[100];
    static int totalStudents = 0;

    public static void main(String[] args) {
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Student Record Management System");
            System.out.println("Choose one");
            System.out.println("1. Add student");
            System.out.println("2. Search student");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. View all students");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> searchStudent();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> viewStudents();
                case 6 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void addStudent() {
        if (totalStudents >= 100) {
            System.out.println("Student list is full");
            return;
        }

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalStudents; i++) {
            if (ids[i] == id) {
                System.out.println("Student ID already exists");
                return;
            }
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.print("Enter grade: ");
        double grade = sc.nextDouble();

        ids[totalStudents] = id;
        names[totalStudents] = name;
        ages[totalStudents] = age;
        courses[totalStudents] = course;
        grades[totalStudents] = grade;
        totalStudents++;

        System.out.println("Student added successfully");
    }

    static void searchStudent() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalStudents; i++) {
            if (ids[i] == id) {
                System.out.println("Student found:");
                System.out.println("ID: " + ids[i]);
                System.out.println("Name: " + names[i]);
                System.out.println("Age: " + ages[i]);
                System.out.println("Course: " + courses[i]);
                System.out.println("Grade: " + grades[i]);
                return;
            }
        }

        System.out.println("Student not found");
    }

    static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalStudents; i++) {
            if (ids[i] == id) {
                System.out.print("Enter new name: ");
                names[i] = sc.nextLine();

                System.out.print("Enter new age: ");
                ages[i] = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new course: ");
                courses[i] = sc.nextLine();

                System.out.print("Enter new grade: ");
                grades[i] = sc.nextDouble();

                System.out.println("Student updated successfully");
                return;
            }
        }

        System.out.println("Student ID not found");
    }

    static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalStudents; i++) {
            if (ids[i] == id) {
                for (int j = i; j < totalStudents - 1; j++) {
                    ids[j] = ids[j + 1];
                    names[j] = names[j + 1];
                    ages[j] = ages[j + 1];
                    courses[j] = courses[j + 1];
                    grades[j] = grades[j + 1];
                }
                totalStudents--;
                System.out.println("Student deleted successfully");
                return;
            }
        }

        System.out.println("Student ID not found");
    }

    static void viewStudents() {
        if (totalStudents == 0) {
            System.out.println("No students found");
            return;
        }

        for (int i = 0; i < totalStudents; i++) {
            System.out.println("****************************************");
            System.out.println("ID: " + ids[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Course: " + courses[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("****************************************");
        }
    }
}
