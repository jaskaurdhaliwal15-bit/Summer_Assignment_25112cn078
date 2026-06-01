import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("enter the number:");
        num = scanner.nextInt();
        int largest = 0;
        for(int i =2 ; i <= num ; i++){
            if(num % i == 0){
                Boolean isprime = true;
                for(int j = 2 ; j <i ; j++){
                    if(i % j == 0){
                        isprime = false;
                        break;
                    }
                }
                if(isprime){
                     largest = i;
                }
            }
        }
        System.out.println( largest);
        scanner.close();
    }
}    