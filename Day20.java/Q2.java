import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        boolean isSymetric = true;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        int[][] matrix1 = new int[rows][rows];
         int[][] trans = new int[rows][rows];
        

        System.out.println("Enter the element of matrix 1");
        for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < rows ; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 :");

         for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < rows ; j++){
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        // transpose

         for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < rows ; j++){
                trans[i][j] = matrix1[j][i];
            }
        }

        // check if symentric
                 for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < rows ; j++){
               if (trans[i][j] != matrix1[i][j]){
                isSymetric = false;
                break;
               }
            }
        }

        if(isSymetric){
            System.out.println("Matrix is symentric");
        }
        else{
            System.out.println("Matrix is not symentric");
        }

        sc.close();
    }
}    