import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter the number: ");
            num = scanner.nextInt();

        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                System.out.printf("%d,",i);
            }
            else{
                continue;
            }
        }
        scanner.close();
    }
}
