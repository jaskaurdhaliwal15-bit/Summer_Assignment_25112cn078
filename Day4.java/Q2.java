import java.util.Scanner;

public class Q2 {
    public static void main(String[] arg){
     int a = 0;
     int b = 1;
     int c ;
     int n;

     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter term  number: ");
     n = scanner.nextInt();

     if(n == 1){
        System.out.println(" Fibonacci = 0");
     }
     else if(n == 2){
        System.out.println(" Fibonacci = 1");
     }
     else{

      for(int i = 3 ; i <= n ; i++){

        c = a + b;
        a = b;
        b = c;
      }
      System.out.println("Fibonacci term = " + b);
     }  

        scanner.close();
    }
}    
