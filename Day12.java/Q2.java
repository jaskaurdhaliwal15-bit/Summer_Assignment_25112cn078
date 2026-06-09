import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num = sc.nextInt();
        Armstrong(num);

        sc.close();

    }
    static void Armstrong(int num){
        int n = num;
        int digit = 0;
        int sum = 0;
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


    }
    
}
