interface Student {
    void getDetails(String name, int roll);
    void showDetails();
}

class Info implements Student {
    String name;
    int roll;

    public void getDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}

public class Main {
    public static void main(String[] args) {
        Info s = new Info();
        s.getDetails("Thanmai", 101);
        s.showDetails();
    }
}
