import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String start;
        String end;
        String range;
        int newStart;
        int newEnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your range(with a '-' seprating it):");
    
        range = scanner.nextLine();
     // finding the start and end and than converting from string to int
      int s=  range.indexOf('-');
      start = range.substring(0,s);
      end =  range.substring(s+1);
     // type conversion 
        newStart = Integer.parseInt(start);
        newEnd = Integer.parseInt(end);
        int i = newStart;
    // finding the range
     while( i <= newEnd){
        int j = 2;
        int isprime = 0;
        while(j < i){
         if(i% j == 0){
         isprime = 1;
         break;
        }
        j++;
      
     }
      if(isprime == 0){
      System.out.print(i + ",");
      }
      i++;
     
}
      scanner.close();
    }
}
