import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("enter the digits:");
        num = scanner.nextInt();

        System.out.println(reverse(num,0));
        scanner.close();
    }
    static int reverse(int num, int rev){
        if(num == 0){
            return rev ;
        }
        else{
        return reverse(num/10, rev*10 + num % 10);
        }

    }
    
}        
