import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int num;
        int num1;
        int gcd = 1;
        Scanner scanner = new Scanner (System.in);

       System.out.print("enter the first number: "); 
       num = scanner.nextInt();
       System.out.print("enter the second number: ");
       num1 = scanner.nextInt();

        for (int i = 1;i <= num && i <= num1;i++) {

            if (num % i == 0 && num1 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The gcd is " + gcd);
        scanner.close();

    }
}