import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int lenVowels = 0;
        int lenConsonats = 0;

        System.out.println("Enter the string ");
        str = sc.nextLine().toLowerCase();

        for(int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);

    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        lenVowels++;
    else if(ch>='a' && ch<='z')
        lenConsonats++;
}

System.out.println("Length of vowels is " + lenVowels);
System.out.println("Length of consonants " + lenConsonats);

sc.close();
     
    }
}
