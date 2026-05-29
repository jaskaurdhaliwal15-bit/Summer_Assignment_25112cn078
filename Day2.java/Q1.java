import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        int j;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the number:");
        num = scanner.nextInt();
        for(int i = num;i>0;i/= 10){
            j = i%10;
            sum+= j;
        }
        System.out.println("The sum of digits of number is " + sum);
        scanner.close();
    }
}
