import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("cherry");

        System.out.println("Fruits: " + fruits);

        fruits.remove("banana");
        System.out.println("After removing banana: " + fruits);

        System.out.println("size: " + fruits.size());
        System.out.println("contains apple: " + fruits.contains("apple"));
    }
}
