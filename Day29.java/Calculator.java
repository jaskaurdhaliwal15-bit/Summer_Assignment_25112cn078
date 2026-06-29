import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Calculator Program");
            System.out.println("Choose one");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> addition();
                case 2 -> subtraction();
                case 3 -> multiplication();
                case 4 -> division();
                case 5 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void addition() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Result = " + (num1 + num2));
    }

    static void subtraction() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Result = " + (num1 - num2));
    }

    static void multiplication() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Result = " + (num1 * num2));
    }

    static void division() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println("Result = " + (num1 / num2));
        }
    }
}