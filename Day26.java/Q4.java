import java.util.Scanner;;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] question = {"1.what house is harry in harry potter",
            "2.which kind og pet does harry have",
            "3.who is best in the trio"};
            
       String[][] options = {{"1.Huffelpuf","2.Ravenclaw" , "3.Slytherine", "4.Gryfindor"},
                             {"1.Dog","2.Owl" , "3.Cat", "4.MOuse"},
                             {"1.Hermonie","2.harry" , "3.Ron", "4.None of the above"}};     

        int[] ans = {4, 2, 1};   
        int guess;
        int score = 0;
        
        for(int i = 0; i < question.length ; i++){
            System.out.println(question[i]);

            for( String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter you ans: ");
            guess = sc.nextInt();

            if(guess == ans[i]){
                System.out.println("Answer is correct");
                score++;
            }
            else{
                System.out.println("Wrong");
            }
        }
        System.out.println("Final score is  " + score + " out of 3");
        sc.close();
    }
}

