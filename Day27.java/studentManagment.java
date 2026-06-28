import java.util.HashMap;
import java.util.Scanner;

public class studentManagment {
    static Scanner sc = new Scanner(System.in);
     static HashMap<Integer, Student> students = new HashMap<>();

    public static void main(String[] args) {
        
        int choice;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("*****************************");
            System.out.println("Students Managment programe");
            System.out.println("Choose one");
            System.out.println("1.Add a student");
            System.out.println("2.Search all students");
            System.out.println("3.Update Student");
            System.out.println("4.Delete student");
            System.out.println("5.Veiw all student");
            System.out.println("6.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("********************************");

            switch(choice){
                case 1 -> addStudent();
                case 2 -> searchStudent();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> viewStudent();
                case 6 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }

       
        System.out.println("Bye ! Have a nice day");

        sc.close();
    }

    static void addStudent(){

        String name;
        int id;
        String course;
        int age;
       
        System.out.println("Enter Students information");
        System.out.println("Student id");
         id = sc.nextInt();
        sc.nextLine();
        if(students.containsKey(id)){
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

        System.out.print("Course : ");
         course = sc.nextLine();

         Student s = new Student( name , id , age , course);

         students.put(id,s);
         System.out.println("Student added !");
    }

    static void searchStudent(){
        int id;
        System.out.print("Enter student id number :");
        id = sc.nextInt();
        sc.nextLine();

        if(!students.containsKey(id)){
            System.out.println("Id number does not exist");
            return;
        }

         Student s = students.get(id);
        s.display();

    }

    static void deleteStudent(){
        int id;
        String ans;
        System.out.print("Enter student id : ");
        id = sc.nextInt();
        sc.nextLine();

        if(!students.containsKey(id)){
            System.out.println("invalid Student");
            return;
        }

        System.out.println("Are you sure you want to delete Student " + id + " (yes/no)") ;
        ans = sc.nextLine();
       if(ans.equalsIgnoreCase("yes")){
         students.remove(id);
         System.out.println("Student removed successfully.");
        }
        else{
            System.out.println("Deletion cancelled.");
        }
    }

    static void viewStudent(){

        if(students.isEmpty()){
            System.out.println("NO students found");
            return;
        }
        for(Student s : students.values()){
            System.out.println("****************************************");
            s.display();
            System.out.println("****************************************");
            System.out.println("****************************************");
        }
    }

    static void updateStudent(){
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if(!students.containsKey(id)){
        System.out.println("Student not found.");
        return;
    }

    Student s = students.get(id);
    s.display();

    System.out.println("**********************");
    System.out.println("Updates ");
    System.out.print("Enter new name: ");
    s.name = sc.nextLine();

    System.out.print("Enter new age: ");
    s.age = sc.nextInt();
    sc.nextLine();
   
    System.out.print("Enter new course: ");
    s.course = sc.nextLine();
    }

}
