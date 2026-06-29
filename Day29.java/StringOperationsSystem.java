import java.util.Scanner;

public class StringOperationsSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1, str2;
        int choice;
        boolean isRunning = true;

        System.out.print("Enter first string: ");
        str1 = sc.nextLine();

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("String Operations System");
            System.out.println("Choose one");
            System.out.println("1. Find length");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Convert to lowercase");
            System.out.println("4. Reverse string");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Compare with another string");
            System.out.println("7. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> findLength(str1);
                case 2 -> toUpperCase(str1);
                case 3 -> toLowerCase(str1);
                case 4 -> reverseString(str1);
                case 5 -> concatenateString(str1);
                case 6 -> compareString(str1);
                case 7 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void findLength(String str) {
        System.out.println("Length = " + str.length());
    }

    static void toUpperCase(String str) {
        System.out.println("Uppercase = " + str.toUpperCase());
    }

    static void toLowerCase(String str) {
        System.out.println("Lowercase = " + str.toLowerCase());
    }

    static void reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String = " + reversed);
    }

    static void concatenateString(String str1) {
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("Concatenated String = " + str1 + str2);
    }

    static void compareString(String str1) {
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
