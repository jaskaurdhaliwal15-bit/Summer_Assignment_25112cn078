import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter number one: ");
        num1 = sc.nextInt();

        System.out.print("Enter number two: ");
        num2 = sc.nextInt();

        System.out.println("The sum is " + Sum(num1,num2));

        sc.close();
    }

    static int Sum(int num1 , int num2){
        return num1 + num2;
    }
    
}
