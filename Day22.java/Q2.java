import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Enter a sentance");
        str = sc.nextLine();

        String[] arr = str.trim().split("\\W+");
      

        System.out.println("Number of words in the sentance is " + arr.length);

        sc.close();
    }
}
