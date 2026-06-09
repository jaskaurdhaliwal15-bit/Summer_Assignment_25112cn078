import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the term of fibonacci ");
        n = sc.nextInt();
        Fibo(n);

        sc.close();

    }
    
    static void Fibo(int n){
        int a = 0;
        int b = 1;
        int c ;

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

    }
}
