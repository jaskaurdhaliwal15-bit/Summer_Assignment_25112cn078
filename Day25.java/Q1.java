import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1;
        int size2;

        System.out.print("Enter the size of array 1: ");
        size1 = sc.nextInt();
        System.out.print("Enter the size of second array : ");
        size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] mergeArr = new int[size1  + size2];

        System.out.println("Enter element in first array in sorted order");
       for(int i = 0; i < size1; i++){
         arr1[i] = sc.nextInt();
        }
        System.out.println("Enter element in second array in sorted order");
       for(int i = 0; i < size2; i++){
        arr2[i] = sc.nextInt();
        }

        int i =0 ;
        int j = 0;
        int k = 0;
        while(i < size1 && j < size2){
            if(arr1[i] <= arr2[j]){
                mergeArr[k] = arr1[i];
                i++;
            }
            else{
                mergeArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < size1){
            mergeArr[k] = arr1[i];
            i++;
        }

        while(j < size2){
            mergeArr[k] = arr2[j];
            j++;
        }

        System.out.println("The merged array is :");
        for(int ele : mergeArr){
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
