import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int num;
        int newNum = 0;
        int j;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        while(num >0){
            
            j = num% 10;
          newNum = (newNum*10)+ j;
          num/= 10;
        }  
        System.out.println("The reverse is " +newNum);
        
        scanner.close();
    }
}
