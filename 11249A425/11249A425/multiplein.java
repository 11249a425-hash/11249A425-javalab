interface Student {
    void showStudent();
}

interface Sports {
    void showSport();
}

class Result implements Student, Sports {

    public void showStudent() {
        System.out.println("Name: Rahul");
        System.out.println("Roll No: 101");
    }

    public void showSport() {
        System.out.println("Sport: Cricket");
    }
}

public class multiplein {
    public static void main(String[] args) {
        Result r = new Result();

        r.showStudent();
        r.showSport();
    }
}
