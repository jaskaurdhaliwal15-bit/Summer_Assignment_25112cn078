import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Enter the string");
        str = sc.nextLine();

      char[] arr = str.toCharArray();
      int n = arr.length - 1;
      int i = 0;

      while(i < n/2){

        char temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        i++;
        n--;

      }
      for(char ch : arr){
      System.out.print(ch);
      }

      sc.close();
    }
}