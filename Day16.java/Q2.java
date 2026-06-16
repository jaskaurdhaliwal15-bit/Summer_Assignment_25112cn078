import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //maximum frequency
        Scanner sc = new Scanner(System.in);
        int currentfre ;
        int maxfre= 0 ;
    
        int maxEle = 0;
        System.out.println("Enter total number of elements");
        int size = sc.nextInt();

       int[] arr = new int[size];

        System.out.println("Enter elements");

        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        // find frequency

       for(int i = 0 ; i < size ; i++){
        currentfre = 0;
        for(int j = 0 ; j < size ; j++){
            if(arr[j] == arr[i]){
                currentfre++;
            }
          
        }
         if(currentfre > maxfre){
                maxfre = currentfre;
                maxEle = arr[i];
            }

       }

       System.out.println("Element with maximum elemant is " + maxEle);

        sc.close();

    }
    
}
