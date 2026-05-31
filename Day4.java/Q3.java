import java.util.Scanner;

public class Q3 {
    public static void main(String[] arg){
     int num;
     int digit = 0;
     int sum = 0 ;
     int n;

     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter term  number: ");
     num = scanner.nextInt();

     n = num;
     // count digit
     while(n>0){
        digit++;
        n /= 10;
     }

     // callculate sum
     int i = num;
     while(i > 0){
        int ld = i % 10;
        sum += (int)Math.pow(ld,digit);
        i /= 10;
     }
     if(sum == num){
        System.out.println("Number is Armstrong");
     }
     else{
        System.out.println("Number is not Armstrong");
     }
     scanner.close();

    }
}