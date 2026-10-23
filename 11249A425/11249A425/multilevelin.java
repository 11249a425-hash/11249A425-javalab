class Student {
    int roll = 101;
    String name = "Kumar";
}

class Marks extends Student {
    int m1 = 80, m2 = 70, m3 = 90, m4 = 85, m5 = 75;
}

class Result extends Marks {
    void calculate() {
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
}

public class multilevelin {
    public static void main(String[] args) {
        Result r = new Result();
        r.calculate();
    }
}


