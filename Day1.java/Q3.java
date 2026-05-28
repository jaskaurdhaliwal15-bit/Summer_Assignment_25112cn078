import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
        int num;
        int i = 1;
        int fact = 1;
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the number you want factorial of: ");
     num = scanner.nextInt();
        while(i<=num){
            fact *= i;
            i++;
        }
        System.out.printf("The factoial is %d",fact );
        scanner.close();
    }
}

