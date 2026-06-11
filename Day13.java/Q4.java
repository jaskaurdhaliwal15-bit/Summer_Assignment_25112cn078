import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;


        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // to take input

        System.out.println("Enter the numbers");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        
        // to count
         for(int i = 0 ; i < size ; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Count of even elements " + even);
        System.out.println("Count of odd elements " + odd);


        sc.close();

    }
}    