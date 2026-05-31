import java.util.Scanner;

public class Q4 {
    public static void main(String[] arg){
     
     int start;
     int end;

     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the starting term: ");
      start = scanner.nextInt();
     System.out.print("Enter the ending term: ");
      end = scanner.nextInt();
    for(int num = start ; num <= end ; num++){
        int digit = 0;
        int sum = 0 ;
     int n = num;
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
        System.out.print(num + " ");
     }
    }
     scanner.close();

    }
}
