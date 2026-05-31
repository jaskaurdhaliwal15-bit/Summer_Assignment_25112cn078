import java.util.Scanner;

public class Q1 {
    public static void main(String[] arg){
        int a = 0;
        int b = 1;
        int c ;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = scanner.nextInt();

        for(int i = 1 ; i <= n ; i++){
            System.out.print( a + ", ");

            c = a + b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}    