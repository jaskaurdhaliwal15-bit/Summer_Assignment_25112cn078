import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String s = sc.next().toLowerCase();
        int[] hash = new int[26];

        // Store frequency of each character
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
          
            }
          
         // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (hash[s.charAt(i) - 'a'] == 1) {
                System.out.println("First non-repeating character: " + s.charAt(i));
                break;
            }
        }


      

        sc.close();
    }
}
