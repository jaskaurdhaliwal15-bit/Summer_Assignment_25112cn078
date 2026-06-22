import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strr;
        boolean isPalindrom = true;

        System.out.println("Enter a string");
        strr = sc.nextLine();
        String str = strr.replaceAll("[^a-zA-Z]" , "").toLowerCase();

        int n = str.length() - 1;
        int i = 0 ;

        while(i < n){
            if(str.charAt(i) != str.charAt(n)){
                isPalindrom = false;
                break;
            }
            i++;
            n--;
        }

        if(!isPalindrom){
            System.out.println("String is not palidrom");
        }
        else{
            System.out.println("String is palindrom");
        }
        sc.close();
    }
}