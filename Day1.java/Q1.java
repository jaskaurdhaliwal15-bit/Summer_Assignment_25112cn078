import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
        int num;
        int i =0;
        int sum =0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number upto which you want the sum: ");
        num = scanner.nextInt();
        while(i<=num){
            sum += i;
            i++;
        
        }
        System.out.printf("The sum is %d",sum);
        scanner.close();
    }
}
