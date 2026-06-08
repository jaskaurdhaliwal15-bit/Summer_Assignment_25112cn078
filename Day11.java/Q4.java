import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Enter the  number : ");
        num1 = sc.nextInt();

        
        System.out.println("The factorial is " + Factorial(num1));

        sc.close();
    }

    static int Factorial(int num){
       if(num == 0){
        return 1;
       } 
       else{
        return num * Factorial(num-1);
       }
    }   
    
    
}

