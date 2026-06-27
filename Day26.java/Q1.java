import java.util.Scanner;
import java.util.Random;
public class Q1 {
    public static void main(String args[]){
        Random random = new Random();
        int guess;
        int num = 0;

        Scanner scanner = new Scanner(System.in);
      guess = random.nextInt(0,11);
      System.out.println("YOu are playing a guessing game");
      
      while(num != guess){
        System.out.print("guess the number between 1-10: ");
        num = scanner.nextInt();
        if(num<guess){
            System.out.println("to less");
        }
        else if(num > guess){
            System.out.println("to high");
        }
        else{
            break;
        }
      }
      System.out.println("Congrats! you won");
      scanner.close();
    }
}

