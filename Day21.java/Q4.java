import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        StringBuilder upper = new StringBuilder();

        System.out.println("Enter the string ");
        str = sc.nextLine();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch<= 'z'){
                upper.append((char)(ch - 32));
            }
            else{
                upper.append(ch);
            }
        }
        System.out.println(upper);
        

        sc.close();
     
    }
    
}
