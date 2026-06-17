import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        LinkedHashSet<Integer> list1 = new LinkedHashSet<>();
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

        // union
        list.addAll(list1);

        System.out.println("Union " + list);

         sc.close();
    }

}    