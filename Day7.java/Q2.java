import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("For how many terms you want to print the series:");
        num = scanner.nextInt();
        for(int i = 0; i < num ; i++){
            System.out.print(fibo(i) + " ");
        }
        scanner.close();
    }
    static int fibo(int num){
        if(num == 0){
            return 0;
        }
        else if(num == 1){
            return 1;
        }
        else{
            return fibo(num -1) + fibo(num - 2);
        }
    }
}
