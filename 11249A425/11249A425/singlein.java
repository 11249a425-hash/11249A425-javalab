class Employee {
    int id = 101;
    String name = "Arun";
    double basic = 20000;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
    }
}

class PermanentEmployee extends Employee {
    double hra = 5000;
    double da = 3000;

    void salary() {
        display();
        double gross = basic + hra + da;
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

public class singlein {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
        p.salary();
    }
}