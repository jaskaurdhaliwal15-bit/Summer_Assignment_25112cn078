public class Q3 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                char alpha = (char)(64 + i);
                System.out.print(alpha);
            }
            System.out.println(" ");
        }
    }
}
