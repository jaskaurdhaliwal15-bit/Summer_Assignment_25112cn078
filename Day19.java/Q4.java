import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int col;
        int sum = 0;
        int sum1 = 0;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter numbr of columns: ");
        col = sc.nextInt();

        int[][] matrix1 = new int[rows][col];
      //  int[][] sum = new int[rows][col];
      //  int[][] sum1 = new int[rows][col];

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

        // sum left diagonal
        System.out.print("sum of left diagonal : ");

         for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                if(i == j){
                    sum += matrix1[i][j];
                }
            }
        }
        System.out.println(sum);

        // sum of right
         System.out.print("sum of right diagonal : ");

         for(int i = 0 ; i< rows ; i ++){
            for(int j = 0 ; j < col ; j++){
                if(j == col - 1 -i ){
                    sum1 += matrix1[i][j];
                }
            }
        }
        System.out.println(sum1);


        sc.close();
    }
}    
