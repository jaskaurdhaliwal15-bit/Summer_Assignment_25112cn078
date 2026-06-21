import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int length = 0;

        System.out.println("Enter the string");
        str = sc.nextLine();

        char[] arr = str.toCharArray();

        for(char ch : arr){
            length++;
        }

        System.out.println("The length is " + length);

        sc.close();

    }
}