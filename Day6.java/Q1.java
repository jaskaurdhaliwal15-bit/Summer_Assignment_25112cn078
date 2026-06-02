import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int binary = 0;
        int place = 1;
     System.out.println("Enter the decimal number");
     num = scanner.nextInt();

     while(num > 0){
        binary = ( num % 2 )*place + binary;
        place *= 10;
        num /= 2;
     }
     System.out.println(binary);
     scanner.close();
    }
    }
