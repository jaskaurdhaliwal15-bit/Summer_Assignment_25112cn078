import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int num;
        int newNum = 0;
        int j;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = scanner.nextInt();
        int i = num;
        while(i >0){
            
            j = i% 10;
          newNum = (newNum*10)+ j;
          i/= 10;
        }  

        if(newNum == num){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        scanner.close();
    }
}
