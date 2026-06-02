import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int binary ;
        int sum = 0;
        int choice;
     System.out.println("choose in ehich form your input is");
     System.out.println("1. Decimal");
     System.out.println("2.Binary");
     choice = scanner.nextInt();
    
     if(choice == 1){
        System.out.print("Enter the decimal number: ");
        num = scanner.nextInt();

        while(num > 0){
            int i  = ( num % 2 );
            if(i == 1){
                sum++;
        }
        num /= 2;
     }
        System.out.println(sum);
    }
    else if(choice == 2){
        System.out.print("Enter the binary digit: ");
        binary = scanner.nextInt();
        while(binary > 0){
        int j = binary % 10;
        if(j == 1){
            sum++;
        }
        binary /= 10;
    }
        System.out.println(sum);

    }
    else{
        System.out.println("incorrect responce");
    }
     scanner.close();
    }
    }

