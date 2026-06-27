import java.util.Scanner;
  
 public class Q3 {
    static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {   
    
    //Declare Variables

    double Balance = 0;
    Boolean isRunning = true;
    int choice;

    
 while(isRunning){
    System.out.println("********************");
    System.out.println("Banking Program");
    System.out.println("********************");
    System.out.println("Choose one");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposite");
    System.out.println("3. withdrawl");
    System.out.println("4. exit");
    System.out.println("*********************");
    choice = scanner.nextInt();

    switch (choice) {
        case 1 -> showBalance(Balance);
        case 2 -> Balance +=  deposit();
        case 3 -> Balance -=  withdrawl(Balance);
        case 4 -> isRunning = false;
        default -> System.out.println("Invalid response");

    }
}
     System.out.println("Thankyou for visiting, Have a nice day "); 
    }

    static void showBalance(double Balance){
        System.out.printf("Final Balance is $%.2f \n", Balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }
    
    }
    static double withdrawl(double Balance){
        double money;
        System.out.print("Enter the amount : ");
        money = scanner.nextDouble();
    
    if(money > Balance ){
        System.out.println("INSUFFICIENT FUNDS");
        return 0;
    }
    else if (money < 0){
        System.out.println("you can not withdwal negative money");
        return 0;
    }
    else{
        return money;
    }
}

}

