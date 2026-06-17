import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int element;
        int element1;
        // take input

        System.out.println("Enter total number of elements in array 1");
        int size = sc.nextInt();

        System.out.println("Enter element");

        for(int i = 0 ; i < size ; i++){
            element = sc.nextInt();
            list.add(element);
        }

         System.out.println("Enter total number of elements in array 2");
        int size1 = sc.nextInt();

        System.out.println("Enter element");

        for(int i = 0 ; i < size1 ; i++){
            element1 = sc.nextInt();
            list1.add(element1);
        }

        // display array
        System.out.println("original array 1 " + list);
         System.out.println("original array 2 " + list1);

         // intersection


         list.retainAll(list1);

         System.out.println("Intersection " + list);
         sc.close();

    }
}         
