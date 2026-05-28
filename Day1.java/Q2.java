import java.util.Scanner;
public class Q2 {
public static void main(String args[]){
    int num;
    int i = 1;
    int multiple;
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("For which number do you want the table to be: ");
    num = scanner.nextInt();
    while(i!=11){
        multiple = num*i;
        System.out.printf("%d * %d = %d \n",num,i,multiple);
        i++;
    }
    scanner.close();
}
}
