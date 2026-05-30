import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int num;
        int num1;
        int lcm= 1;
        Scanner scanner = new Scanner (System.in);

       System.out.print("enter the first number: "); 
       num = scanner.nextInt();
       System.out.print("enter the second number: ");
       num1 = scanner.nextInt();
    
       lcm = Math.max(num,num1);

           while (true) {
            if (lcm % num == 0 && lcm % num1 == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("The lcm is " + lcm);
        scanner.close();

    }
}
