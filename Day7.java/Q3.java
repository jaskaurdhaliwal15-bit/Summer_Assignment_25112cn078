import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("enter the digits:");
        num = scanner.nextInt();
        System.out.println(sum(num));
        scanner.close();
    }
    static int sum(int num){
        if(num == 0){
            return 0;
        }
        else{
        int ld = num % 10;
        return ld + sum(num/10);
        }
        
    }
}        

