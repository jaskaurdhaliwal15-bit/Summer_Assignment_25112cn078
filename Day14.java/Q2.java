import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    int search;
    int count = 0;
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

   // leniar search and frequency counting
  
   
   System.out.print("Enter the number to find frequency : ");
   search = sc.nextInt();


   for(int i = 0 ; i < size ; i++){
     if(arr[i] == search){

        isFound = true;
        count++;
        
     }
   }

   if(!isFound){
    System.out.println("Number not found");
   }

   System.out.println(" Frequency of the element is " + count);

     sc.close();
    
   
}
    
}
