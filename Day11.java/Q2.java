import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter number one: ");
        num1 = sc.nextInt();

        System.out.print("Enter number two: ");
        num2 = sc.nextInt();

        System.out.println("The maximun is " + Max(num1,num2));

        sc.close();
    }

    static int Max(int num1 , int num2){
        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    
}
