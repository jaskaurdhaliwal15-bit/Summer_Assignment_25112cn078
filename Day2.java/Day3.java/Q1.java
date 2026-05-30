import java.util.Scanner;
public class Q1 {
   public static void main(String[] args){
    int num;
    int isprime = 0;
    int j;
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter The number you want to check: ");
    num = scanner.nextInt();

    for(int i = 2; i < num;i++){
       if(num % i == 0){
        isprime = 1;
        break;
       }
    }
    if(isprime == 0){
        System.out.println("Number is prime");
    } 
    else{
        System.out.println("Number is not prime");
    }  

   scanner.close();
   }
}
