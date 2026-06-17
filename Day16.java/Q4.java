import java.util.ArrayList;
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

        // display array
        System.out.println("original array" + list);

        for(int i = 0 ; i < list.size() ; i++){
            for(int j = i+1; j < list.size() ; j++){
            if(list.get(i).equals(list.get(j))){
                list.remove(j);
                j--;
            }
            }
        }

        System.out.println(list);

        sc.close();
    }
}

