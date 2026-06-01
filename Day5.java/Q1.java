 import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.print("Enter the number:");
        num = scanner.nextInt();
        
        for(int i = 1; i < num ; i++){
            if(num % i == 0){
                sum+= i;
                }
            }
           
        if( sum == num){
            System.out.println("Number is a perfect number");
        }
        else{
            System.out.println("Number is not perfect");
        }
        
     scanner.close();   

    }
}
        