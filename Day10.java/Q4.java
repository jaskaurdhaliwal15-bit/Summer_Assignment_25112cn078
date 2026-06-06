public class Q4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5 ; i++){
            for(int j = 1 ; j <= 5-i ; j ++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++){
                char alpha = (char)(64 + k);
                System.out.print(alpha);
            }
            for(int l = 1 ; l <= i-1; l++){
                char b = (char)(64 + l);
                System.out.print(b);
            }
            System.out.println();
        }
    }
}

