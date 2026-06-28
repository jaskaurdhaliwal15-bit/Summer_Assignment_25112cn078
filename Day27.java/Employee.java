class Employee { 
    String name;
    int id;
    int age;
    String department;
    String desigination;
    double salary;
    
    
    Employee( String name, int id ,int age , String department,String desigination,double salary){
        this.name = name; 
        this.id = id; 
        this.age = age; 
        this.department = department;
        this.desigination = desigination;
        this.salary = salary; 
    } 
    
    void display(){ 
        System.out.println("ID : " + this.id); 
        System.out.println("Name : " + this.name); 
        System.out.println("age : " + this.age); 
        System.out.println("department : " + this.department);
        System.out.println("Desigination : "+ this.desigination);
        System.out.println("Salary :" + this.salary);
     } 
    } 