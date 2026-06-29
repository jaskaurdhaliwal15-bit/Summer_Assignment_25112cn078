public class Ticket {
    
    int id;
    String name;
    int age;
    String type;
    int quantity;

    Ticket(int id ,String name ,int age , String type,int quantity){
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.quantity = quantity;
    }

    int totalPrice(String ty , int n){
        if(ty.equals("vip")){
            return n*1000;
        }
        else{
            return n*500;
        }
    }

    void display(){
        System.out.println("Ticket ID : " + this.id);
        System.out.println("Name : " + this.name );
        System.out.println("Agr : " + this.age);
        System.out.println("Type :" + this.type);
        System.out.println("Quantity :" + this.quantity);
        System.out.println("Total fare : " + totalPrice(this.type, this.quantity));
    }
}
