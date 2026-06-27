import java.util.Scanner;
public class Q2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        int choice;
        boolean isRunning = true;
        
        while(isRunning){
        System.out.println("*********************************");
        System.out.println("Welcome, To voter eligibily ");
        System.out.println("*********************************");
        System.out.println("Choose a option");
        System.out.println("1.Check eligibility");
        System.out.println("2.View voting rules");
        System.out.println("3.exit");
        choice = sc.nextInt();
        sc.nextLine();
        System.out.println("***********************************");
        switch (choice) {
        case 1 -> checkElligibility();
         case 2 ->   System.out.println("""
                    1. person should be atleat 18
                    2. person should be a citizen of the country
                    3. person should have a voter ID card
                    """);
        case 3 -> isRunning = false;
        default -> System.out.println("invalid response");
        }
       
    }
        System.out.println("Bye ! have a nice day");

        sc.close();

    
}

    static void checkElligibility(){
        String name;
        int age;
        String citizen;
        String voterID;
        boolean iseligeble = true;
        System.out.println("Enter your imformation");
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print(" age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Citizenship(YES/NO) : ");
        citizen = sc.nextLine();
        System.out.print("Voter ID(YES/NO) : ");
        voterID = sc.nextLine();

        if(age <=0){
            System.out.println("invalid input. Try again");
        }
       
         if ( !citizen.equalsIgnoreCase("yes")){
            System.out.println("you are not a citizen of this country");
            iseligeble = false;
        }
         if (!voterID.equalsIgnoreCase("yes") ){
            System.out.println("you do not have a voterID");
            iseligeble = false;
        }
         if(age < 18){
            System.out.println("Your age does not meet the creteria");
            iseligeble = false;
        }
        if(!iseligeble){
            System.out.println("You are not eligibel for voting");
        }
        if(iseligeble){
            System.out.println("Congrats! you are eligibel to vote");
        }

    
    }
}
