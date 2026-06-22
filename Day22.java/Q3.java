import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String s = sc.next().toLowerCase();

        int[] hash = new int[26];

        // Store frequency of each character
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.print("Enter character: ");
            char c = sc.next().toLowerCase().charAt(0);

            System.out.println(hash[c - 'a']);

            q--;
        }

        sc.close();
    }
}