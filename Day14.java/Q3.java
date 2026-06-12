import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // to take input

        System.out.println("Enter the numbers");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int secondLargest = arr[0];

        // to find max
        for(int i = 0 ; i < size ; i++ ){
            if( max < arr[i]){
                max = arr[i];
            }       
        }
        // for second max

        for(int i = 0 ; i < size ; i++){

            if(arr[i] != max &&  arr[i] > secondLargest ){
                secondLargest = arr[i];
            }
        }
       

        

             System.out.println("The secong lergest  is " + secondLargest);
            

        sc.close();

    }
}        

