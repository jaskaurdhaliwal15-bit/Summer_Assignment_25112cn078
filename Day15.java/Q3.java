 import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int element;
        int rightRotate;
        // take input

        System.out.println("Enter total number of elements");
        int size = sc.nextInt();

        System.out.println("Enter element");

        for(int i = 0 ; i < size ; i++){
            element = sc.nextInt();
            list.add(element);
        }



        // display array
        System.out.println("original array" + list);


        // rotate array

        System.out.print("By how much do you want to rotate the array left: ");
        rightRotate = sc.nextInt();

       Collections.rotate(list,rightRotate);

            
            
        System.out.println(list);


        sc.close();
    }
    
}

 
    

