import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        
        

        System.out.print("Enter a sentance : ");
        str = sc.nextLine();

        String[] arr = str.trim().split("\\W+");

        int maxlen = arr[0].length();
        String maxstr = arr[0];

        for(int i = 0; i < arr.length ; i++){
            if(maxlen < arr[i].length()){
               maxlen = arr[i].length();
                maxstr = arr[i];
            }
        }

        System.out.println("the longest word is " + maxstr);
         

        sc.close();
    }
}
