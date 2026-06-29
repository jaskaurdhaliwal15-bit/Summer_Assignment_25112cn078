import java.util.Scanner;

public class ArrayOperationsSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[100];
        int size = 0;
        int choice;
        boolean isRunning = true;

        System.out.print("Enter number of elements: ");
        size = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Array Operations System");
            System.out.println("Choose one");
            System.out.println("1. Display array");
            System.out.println("2. Insert element");
            System.out.println("3. Delete element");
            System.out.println("4. Search element");
            System.out.println("5. Find largest element");
            System.out.println("6. Find smallest element");
            System.out.println("7. Calculate sum");
            System.out.println("8. Exit");
            choice = sc.nextInt();
            System.out.println("********************************");

            switch (choice) {
                case 1 -> displayArray(arr, size);
                case 2 -> size = insertElement(arr, size);
                case 3 -> size = deleteElement(arr, size);
                case 4 -> searchElement(arr, size);
                case 5 -> findLargest(arr, size);
                case 6 -> findSmallest(arr, size);
                case 7 -> calculateSum(arr, size);
                case 8 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Bye! Have a nice day");
        sc.close();
    }

    static void displayArray(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int insertElement(int[] arr, int size) {
        if (size >= arr.length) {
            System.out.println("Array is full");
            return size;
        }

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position (0 to " + size + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return size;
        }

        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = element;
        size++;
        System.out.println("Element inserted successfully");
        return size;
    }

    static int deleteElement(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty");
            return size;
        }

        System.out.print("Enter element to delete: ");
        int element = sc.nextInt();
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found");
            return size;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        System.out.println("Element deleted successfully");
        return size;
    }

    static void searchElement(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }

    static void findLargest(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int largest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }

    static void findSmallest(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int smallest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }

    static void calculateSum(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements: " + sum);
    }
}
