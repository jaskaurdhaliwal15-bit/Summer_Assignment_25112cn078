import java.util.HashSet;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(!set.contains(ch)) {
                set.add(ch);
                
            }
            else{

                duplicate.add(ch);
            }
        }

        System.out.println("Duplicate charater are :");
        for(char ch : duplicate){
            System.out.print(ch + " ");
        }



        sc.close();
    }
}
