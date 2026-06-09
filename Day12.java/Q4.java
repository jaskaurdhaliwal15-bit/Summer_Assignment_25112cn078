import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num = sc.nextInt();
        Perfect(num);

        sc.close();

    }

    static void Perfect(int num){
        int sum = 0;
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
    }
    
}
