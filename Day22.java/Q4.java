import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Enter a string");
        str = sc.nextLine();

        String s = str.replace(" ","");

        System.out.println(s);

        sc.close();
    }
}
