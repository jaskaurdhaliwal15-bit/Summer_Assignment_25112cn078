import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String s = sc.next().toLowerCase();
        int[] hash = new int[26];

        // Store frequency of each character
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
          
            }
          
         // Find max repeating character
         int max = hash[s.charAt(0) - 'a'];
         char ch = ' ' ;
        for (int i = 0; i < s.length(); i++) {
            if (hash[s.charAt(i) - 'a'] > max ) {

                max = hash[s.charAt(i) - 'a'] ; 
                ch = s.charAt(i) ;
            }
        }

        System.out.println("Character with max frequency : " + ch);
      

        sc.close();
    }
}


