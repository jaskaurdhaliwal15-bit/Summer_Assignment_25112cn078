import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(11);
        char guess ;
        int wrongGuess = 0;
        
        

    // display Statement
        System.out.println("************************");
        System.out.println("Hangman game");
        System.out.println("*************************");

        
    

    //import word object


    Secretword sw = new Secretword(number);

    String word = sw.secret(number) ;

    // let the user guess

    ArrayList<Character> wordState = new ArrayList<>();

    System.out.print("Word : ");
    for(int i = 0 ; i< word.length() ; i ++){
        wordState.add('_');
    }
    System.out.println(wordState);
    while(wrongGuess < 6){

        boolean isFound = false;

        hangmanArt(wrongGuess);

        System.out.print("Your guess: ");
        guess =sc.next().toLowerCase().charAt(0);

        for(int i = 0 ; i < word.length() ; i++ ){
            if( word.charAt(i) == guess){
                wordState.set(i,guess);
              isFound = true;

              
            }
        }    

            if(!isFound){

                // wrong guess
                System.out.println("Wrong guess");
                wrongGuess++;
            }
        

        System.out.println(wordState);
       if(!wordState.contains('_')){
        System.out.println("You won");
        break;
       }
    
    }
    

    if(wrongGuess == 6){
        hangmanArt(wrongGuess);
        System.out.println("*******************");
        System.out.println("You loss");
        System.out.println( "The word was " + word);
        System.out.println("***********************");
    }

    sc.close();

}

// the handman method

 static void hangmanArt( int wrongGuess){

    switch(wrongGuess){

        case 1 -> System.out.println("""
                
                     o

        """);
        case 2 -> System.out.println("""
                       o
                       |
                """);
        case 3 -> System.out.println("""
                       o
                     / |
                """);          
        case 4 -> System.out.println("""
                       o
                     / | \\
                """);  
        case 5 -> System.out.println("""
                       o
                     / | \\
                      /
                """);
        case 6 -> System.out.println("""
                       o
                     / | \\
                      / \\
                
                """);  
        default -> System.out.println();                             
                
    }

 }

}
    

    
    

