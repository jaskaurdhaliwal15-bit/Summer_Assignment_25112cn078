public class Secretword {

    int number;

    Secretword(int number){
        this.number = number;
    }

    String secret(int n){
        return switch (n) {
        
        case 1 -> "bannan";
        case 2 ->  "apple";
        case 3 ->  "pinneaple";
        case 4 ->  "strawbeery";
        case 5 ->  "blackberry";
        case 6 ->  "watermelon";
        case 7 ->  "lichi";
        case 8 ->  "avacado";
        case 9 ->  "papaya";
        case 10 ->  "coconut";
        default -> "trick";};
        
    }
    
}
