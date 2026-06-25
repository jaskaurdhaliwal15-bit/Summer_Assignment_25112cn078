import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        
        

        System.out.print("Enter a sentance : ");
        str = sc.nextLine();

        String[] arr = str.trim().split("\\W+");

              for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j].length() > arr[j + 1].length()) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

       System.out.println("word sorted by length ");
       for(String str1 : arr){
        System.out.print(str1 + " ");
       }


       

        sc.close();
    }
}

