class Student { 
    String name;
    int id;
    int age;
    String course;
    
    
    Student( String name, int id ,int age ,String course ){
        this.name = name; 
        this.id = id; 
        this.age = age; 
        this.course = course; 
    } 
    
    void display(){ 
        System.out.println("ID : " + this.id); 
        System.out.println("Name : " + this.name); 
        System.out.println("age : " + this.age); 
        System.out.println("Course : " + this.course);
     } 
    } 