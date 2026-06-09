import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num = sc.nextInt();
        Palindrom(num);

        sc.close();

    }

    static void Palindrom(int num){
        int newNum = 0;
         for(int i = num ; i > 0 ; i/= 10){
            
            int j = i% 10;
          newNum = (newNum*10)+ j;
        }  

        if(newNum == num){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
