public class Marksheet {
    int id;
    String name;
    int english;
    int math;
    int science;
    int hindi;
    int computer;

    public Marksheet(int id, String name, int english, int math, int science, int hindi, int computer) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
        this.science = science;
        this.hindi = hindi;
        this.computer = computer;
    }

    public int totalMarks() {
        return english + math + science + hindi + computer;
    }

    public double percentage() {
        return totalMarks() / 5.0;
    }

    public String grade() {
        double p = percentage();

        if (p >= 90) return "A+";
        else if (p >= 80) return "A";
        else if (p >= 70) return "B";
        else if (p >= 60) return "C";
        else if (p >= 50) return "D";
        else return "F";
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("English: " + english);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("Hindi: " + hindi);
        System.out.println("Computer: " + computer);
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Percentage: " + percentage() + "%");
        System.out.println("Grade: " + grade());
    }
}