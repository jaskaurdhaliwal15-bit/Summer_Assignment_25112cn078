import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of students ");
        size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];
        System.out.println("Enter the names of students : ");
        for(int i = 0; i < size ; i++){
            arr[i] = sc.nextLine();
        }

          for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {

                if(arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Names in sorted array : ");
        for(String str : arr){
            System.out.println(str);
        }

        sc.close();
    }
}
