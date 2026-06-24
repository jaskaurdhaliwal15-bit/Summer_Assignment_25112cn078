import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
       int count = 1;

        System.out.print("enter the string :");
        str = sc.nextLine();

        StringBuilder compress = new StringBuilder();

        for(int i = 0 ; i <str.length() - 1;  i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                compress.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
           compress.append(str.charAt(str.length()-1)).append(count);
           String str1 = compress.toString();

        if(str1.length() > str.length()){
            System.out.println(str + " String is already compressed" );
        }
        else{
            System.out.print("Compressed sttring :" + str1);
        }


        sc.close();
    }
}
 