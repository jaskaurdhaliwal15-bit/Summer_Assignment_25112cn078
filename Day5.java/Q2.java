import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        System.out.print("Enter the number: ");
        num = scanner.nextInt();
        int sum = digit(num);
        if(sum == num){
            System.out.println("Number is a strong number");
        }
        else{
            System.out.println("Number is not a strong number");
        }
        scanner.close();


    } 
    
    static int digit(int num){
        int sum = 0;
        while(num > 0){
        int ld  = num % 10;
        int Fact = Factorial(ld);
        sum += Fact;
        num /= 10;
    }

    return sum; 
}

   static int Factorial(int ld){
    int a = 1;
    for(int i = 1; i <= ld ;i++ ){
        a *= i;
    }
     return a;
   }
}