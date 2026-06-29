import java.util.HashMap;
import java.util.Scanner;

public class ticketBooking {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer,Ticket> tickets = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("*************************************************");
            System.out.println("Welcome to our Amusment park");
            System.out.println("Please,choose one option to proceed further");
            System.out.println("1.Book a ticket");
            System.out.println("2.Delete a Booking");
            System.out.println("3.Search a Booking");
            System.out.println("4.exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("****************************************************");

            switch (choice) {
               case 1 -> bookTicket();
               case 2 -> deleteTicket();
               case 3 -> searchTicket();
               case 4 -> isRunning = false;
               default -> System.out.println("INVALID RESPONE");

        }
    }

    System.out.println("Enjoy your rides!");
}

    static void bookTicket(){

        System.out.print("Enter ticket id : ");
        int id = sc.nextInt();
        sc.nextLine();
        if(tickets.containsKey(id)){
            System.out.println("ID already exits");
            return;
        }

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();
        if(age < 0 || age > 100){
            System.out.println("INALID AGE");
        }

        System.out.println("Which type of ticket would you like");
        System.out.print("VIP = 1000 or NORMAL = 500 per ticket : ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("Quantity of tickets :");
        int quantity = sc.nextInt();
        sc.nextLine();
        if(quantity < 0){
            System.out.println("InVALID RESPONSE");
            return;
        }

        System.out.print("Do you have a child of age less than 5 (yes/no) : ");
        String ans = sc.nextLine().trim().toLowerCase();

        if(ans.equals("yes")){
            System.out.println("Enter the number of child less than 5");
            int ch = sc.nextInt();
            if(ch < 0 || ch >= quantity){
                System.out.println("Invalid number");
                return;
            }
            sc.nextLine();
            quantity = quantity - ch;
            System.out.println("entry of " + ch + " children are free");
        }

        Ticket t = new Ticket(id, name, age, type, quantity);
        tickets.put(id,t);
        System.out.println("Ticket book succesfully");
        t.display();
    }

     static void deleteTicket(){

        if(tickets.isEmpty()){
            System.out.println("NO tickets are booked");
            return;
        }
        System.out.print("Enter the ticket ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        if(!tickets.containsKey(id)){
            System.out.println("ID does not exist");
            return ;
        }

        System.out.print("DO you want to delete ticket id " + id + "(yes/no) :");
        String ans = sc.nextLine().toLowerCase();

        if(ans.equals("yes")){
            tickets.remove(id);
            System.out.println(" Booking deleted succesfully ");
        }
        else{
            System.out.println("ticket is not deleted");
        }
    }

     static void searchTicket(){
        System.out.print("Enter ticket id : ");
        int id = sc.nextInt();
        sc.nextLine();

        if(!tickets.containsKey(id)){
            System.out.println("id does not exist");
            return;
        }
        Ticket t = tickets.get(id);
        t.display();
    }
}
