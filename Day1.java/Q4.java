import java.util.Scanner;
public class Q4 {
    public static void main(String args[]){
        int num;
        int i;
        int count= 0;
        Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the digit:");
      num = scanner.nextInt(); 
      while(num !=0 ){
        count++;
        num /= 10;
      } 
      System.out.print("The digit in number is " + count);
    }
}          
