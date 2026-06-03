import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num;
      System.out.print(" enter the number: ");
      num = scanner.nextInt();
      int ans = Factorial(num);
      System.out.println(ans);
      
      scanner.close();
    }
    static int Factorial(int num){
        if(num == 1 ||num  == 0){
            return 1;
        }
        else{
            return num* Factorial(num - 1);
        }
    }
}