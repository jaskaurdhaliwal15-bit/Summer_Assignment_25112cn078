import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    int search;
     boolean isFound = false;
     
    //initialys array
    System.out.print("Enter the size of array: ");
    size = sc.nextInt();

    int[] arr = new int[size];

    // input array

    System.out.println("Enter the element");

   for( int i = 0 ; i < size ; i++){
     arr[i] = sc.nextInt();
    
   }

   // leniar search
  
   
   System.out.println("Enter the number to search");
   search = sc.nextInt();

   for(int i = 0 ; i < size ; i++){
     if(arr[i] == search){
        System.out.println("number is found at index : " + i);
        isFound = true;
     }
   }

   if(!isFound){
    System.out.println("Number not found");
   }
    
    sc.close();
    
    }
    
}
