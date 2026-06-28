public class Salary {

    int id;
    String name;
    double basicSalary;
    double bonus;
    double deduction;

    public Salary(int id, String name, double basicSalary,
                    double bonus, double deduction) {

        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public double calculateSalary() {
        return basicSalary + bonus - deduction;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
        System.out.println("Net Salary: " + calculateSalary());
    }

}
