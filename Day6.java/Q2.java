import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int decimal = 0;
        int power = 0;
     System.out.println("Enter the binary number");
     num = scanner.nextInt();

     while(num > 0){
        int ld = num % 10;
        decimal += ld * Math.pow(2,power);
        power++;
        num /= 10;
     }
     System.out.println(decimal);
     scanner.close();
    }
    }

