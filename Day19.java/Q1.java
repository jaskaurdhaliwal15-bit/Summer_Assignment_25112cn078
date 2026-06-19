import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int col;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter numbr of columns: ");
        col = sc.nextInt();

        int[][] matrix1 = new int[rows][col];
        int[][] matrix2 = new int[rows][col];
        int[][] sum = new int[rows][col];

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

         System.out.println("Enter the element of matrix 2");
        for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 2 :");
         for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }

          for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum is : ");

         for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }





        
        sc.close();
    }
}

