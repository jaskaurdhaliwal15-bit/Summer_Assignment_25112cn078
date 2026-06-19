import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int col;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter numbr of columns: ");
        col = sc.nextInt();

        int[][] matrix1 = new int[rows][col];


        System.out.println("Enter the element of matrix 1");
        for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 :");

         for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        // transpose
        System.out.println("Transpose is : ");

         for(int i = 0 ; i< col ; i ++){
            for(int j = 0 ; j < rows ; j++){
                System.out.print(matrix1[j][i] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}    