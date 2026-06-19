import java.util.Scanner;

public class Q4 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[rows][col];
        int[] sum = new int[col];

        System.out.println("Enter the elements:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

         System.out.println("Matrix 1 :");

         for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // column-wise sum
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                sum[j] += matrix[i][j];
            }
        }

        System.out.println("column-wise sums:");
        for(int i = 0; i < col; i++){
            System.out.print( sum[i] + " ");
        }

        sc.close();
    }

}
