import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int sum ;

        System.out.println("Enter total number of elements");
        int size = sc.nextInt();

       int[] arr = new int[size];

        System.out.println("Enter elements");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum");
        sum = sc.nextInt();

        for(int i = 0 ; i < size ; i ++){
            for(int j = i+1 ; j < size ; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.printf("The pair are %d and %d \n",arr[i],arr[j]);
                }
            }
        }


        sc.close();
    }
    
}
