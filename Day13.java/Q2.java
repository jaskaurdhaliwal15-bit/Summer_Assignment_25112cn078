import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg = 0;


        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // to take input

        System.out.println("Enter the numbers");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        // for sum

        for(int i = 0 ; i < size ; i++){
            sum+= arr[i];
            
        }
        // for average
        avg = sum/size ;

        System.out.println( "The sum is " + sum);
        System.out.println("The average is " + avg);

        sc.close();
    }
}        
