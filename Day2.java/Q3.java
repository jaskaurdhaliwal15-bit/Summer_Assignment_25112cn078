import java.util.Scanner;
public class Q3 {
   public static void main(String[] args) {
        int num;
        int product = 1;
        int j;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the number:");
        num = scanner.nextInt();
        for(int i = num;i>0;i/= 10){
            j = i%10;
            product*= j;
        }
        System.out.println("The sum of digits of number is " + product);
        scanner.close();
   } 
}
