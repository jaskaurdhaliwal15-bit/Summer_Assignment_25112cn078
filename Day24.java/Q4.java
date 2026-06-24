import java.util.HashSet;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + result);

        sc.close();
    }
}