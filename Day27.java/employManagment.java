
import java.util.HashMap;
import java.util.Scanner;

public class employManagment {
    static Scanner sc = new Scanner(System.in);
     static HashMap<Integer, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        
        int choice;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("*****************************");
            System.out.println("employee Managment programe");
            System.out.println("Choose one");
            System.out.println("1.Add a employee");
            System.out.println("2.Search employee");
            System.out.println("3.Update employee");
            System.out.println("4.Delete employee");
            System.out.println("5.Veiw all employee");
            System.out.println("6.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch(choice){
                case 1 -> addEmployee();
                case 2 -> searchEmployee();
                case 3 -> updateEmployee();
                case 4 -> deleteEmployee();
                case 5 -> viewEmloyee();
                case 6 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }

       
        System.out.println("Bye ! Have a nice day");

        sc.close();
    }


    static void addEmployee(){

        String name;
        int id;
        String department;
        int age;
        String desigination;
        double salary;
       
        System.out.println("Enter employee information");
        System.out.println("employee id");
         id = sc.nextInt();
        sc.nextLine();
        if(employees.containsKey(id)){
            System.out.println("ID already exist");
            return;
        }
        System.out.print("Name : ");
         name = sc.nextLine();

        System.out.print("Age : ");
         age = sc.nextInt();
        sc.nextLine();
        if(age < 0 ){
            System.out.println("Invalid age ");
            return;
        }

        System.out.print("Depatment : ");
         department = sc.nextLine();

        System.out.println("Desigination : ");
        desigination = sc.nextLine();

        System.out.println("Salary :");
        salary = sc.nextDouble();
        if(salary < 0){
            System.out.println("INVALID AMOUNT");
            return;
        }
        Employee e  = new Employee( name , id , age , department , desigination, salary);

         employees.put(id,e);
         System.out.println("employee added !");
    }

    static void searchEmployee(){
        int id;
        System.out.print("Enter employee id number :");
        id = sc.nextInt();
        sc.nextLine();

        if(!employees.containsKey(id)){
            System.out.println("Id number does not exist");
            return;
        }

        Employee e = employees.get(id);
        e.display();

    }

    static void deleteEmployee(){
        int id;
        String ans;
        System.out.print("Enter employee id : ");
        id = sc.nextInt();
        sc.nextLine();

        if(!employees.containsKey(id)){
            System.out.println("invalid ID");
            return;
        }

        System.out.println("Are you sure you want to delete employee " + id + " (yes/no)") ;
        ans = sc.nextLine();
       if(ans.equalsIgnoreCase("yes")){
         employees.remove(id);
         System.out.println("employee removed successfully.");
        }
        else{
            System.out.println("Deletion cancelled.");
        }
    }

    static void viewEmloyee(){

        if(employees.isEmpty()){
            System.out.println("NO employee found");
            return;
        }
        for(Employee e  : employees.values()){
            System.out.println("****************************************");
            e.display();
            System.out.println("****************************************");
            System.out.println("****************************************");
        }
    }

    static void updateEmployee(){
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if(!employees.containsKey(id)){
        System.out.println("Student not found.");
        return;
    }

    Employee e = employees.get(id);
    e.display();

    System.out.println("**********************");
    System.out.println("Updates ");
    System.out.print("Enter new name: ");
    e.name = sc.nextLine();

    System.out.print("Enter new age: ");
    e.age = sc.nextInt();
    sc.nextLine();
   
    System.out.print("Enter new course: ");
    e.department = sc.nextLine();

    System.out.print("Enter new desigination : ");
    e.desigination = sc.nextLine();

    System.out.print("Enter new salary :");
   e.salary = sc.nextDouble();
    }

}

