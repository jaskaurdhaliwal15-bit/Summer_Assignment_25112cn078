import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = scanner.nextInt();
        prime(num);
    }

    static void prime(int num){
        int isPrime = 0;
        for(int i = 2 ;i <= num/2 ; i++){
            if(num % i == 0){
                isPrime = 1;
                break;
            }
        }
        if(isPrime == 0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }

    }
}
