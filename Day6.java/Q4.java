import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int n;
        int ans = 1;
        System.out.print("Enter the number: ");
        x = scanner.nextInt();
        System.out.print("How many times the power is being raised: ");
        n = scanner.nextInt();

        while(n > 0){
            ans *= x;
            n--;
        }
        System.out.println(ans);

        scanner.close();
    }
}
