class StudentThis {
    String name;

    StudentThis(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        StudentThis s = new StudentThis("Alice");
        s.display();
    }
}
