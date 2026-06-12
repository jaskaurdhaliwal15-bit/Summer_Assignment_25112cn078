import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        boolean isDublicate = false;

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // to take input

        System.out.println("Enter the numbers");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        // to find duplicate

        for(int i = 0 ; i < size ; i++){
            for(int j = i + 1 ; j < size ; j++){
                if(arr[i] == arr[j] ){

                    isDublicate = true;
                    System.out.println("Duplicate occur of " + arr[i] + " at index " + i + " and " + j );
                }
            }
        }


        if(!isDublicate){
            System.out.println("There are no duplicates");
        }

        sc.close();
    }
}        
