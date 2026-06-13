import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int element;
        
        // take input

        System.out.println("Enter total number of elements");
        int size = sc.nextInt();

        System.out.println("Enter element");

        for(int i = 0 ; i < size ; i++){
            element = sc.nextInt();
            list.add(element);
        }

        for(int i = 0 ; i < size ; i++){
            if(list.get(i) == 0){
                list.remove(i);
                list.add(0);
            }
            
        }

        

        System.out.println(list);

        sc.close();
    }
    
}
