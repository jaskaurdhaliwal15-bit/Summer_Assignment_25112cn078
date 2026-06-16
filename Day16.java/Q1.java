import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        int missing;
        int sum = 0;
        int sumExpected = 0;
        
        // take input

        System.out.println("Enter total number of elements");
        int size = sc.nextInt();

       int[] arr = new int[size];

        System.out.println("Enter elements");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
            sum+= arr[i];
    
        }

        // expected sum;

        sumExpected = (size + 1 )* (arr[0] + arr[size-1])/2 ;

        missing = sumExpected - sum ;

        System.out.println("The missing element is " + missing);
        
        

        sc.close();
    }
    
}
