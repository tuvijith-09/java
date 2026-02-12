import java.util.ArrayList;

class Learner {

    String studentName;
    ArrayList<Double> marks;

    Learner(String studentName) {
        this.studentName = studentName;
        marks = new ArrayList<>();
    }

    void addMark(double mark) {
        marks.add(mark);
    }

    double getAverage() {
        if (marks.size() == 0) {
            return 0;
        }

        double total = 0;

        for (double m : marks) {
            total += m;
        }

        return total / marks.size();
    }

    void showDetails() {
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Average: " + getAverage());
        System.out.println("-------------------");
    }
}

class ResultSystem {

    ArrayList<Learner> learnerList = new ArrayList<>();

    void addLearner(Learner l) {
        learnerList.add(l);
    }

    Learner searchByName(String name) {
        for (Learner l : learnerList) {
            if (l.studentName.equalsIgnoreCase(name)) {
                return l;
            }
        }
        return null;
    }

    void showAll() {
        for (Learner l : learnerList) {
            l.showDetails();
        }
    }
}

public class TestApp {

    public static void main(String[] args) {

        ResultSystem system = new ResultSystem();

        Learner l1 = new Learner("Arjun");
        Learner l2 = new Learner("Sneha");

        system.addLearner(l1);
        system.addLearner(l2);

        l1.addMark(85);
        l1.addMark(92);

        l2.addMark(78);
        l2.addMark(88);

        system.showAll();

        Learner found = system.searchByName("Arjun");

        if (found != null) {
            System.out.println("Learner Found:");
            found.showDetails();
        } else {
            System.out.println("Not Found");
        }
    }
}
