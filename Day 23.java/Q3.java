import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.next().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
            sc.close();
            return;
        }

        int[] hash1 = new int[26];
        int[] hash2 = new int[26];

        // Count frequency of first string
        for (int i = 0; i < str1.length(); i++) {
            hash1[str1.charAt(i) - 'a']++;
        }

        // Count frequency of second string
        for (int i = 0; i < str2.length(); i++) {
            hash2[str2.charAt(i) - 'a']++;
        }

        boolean isAnagram = true;

        // Compare both frequency arrays
        for (int i = 0; i < 26; i++) {
            if (hash1[i] != hash2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }

        sc.close();
    }
}
