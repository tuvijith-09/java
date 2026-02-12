import java.util.ArrayList;

class Item {

    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class CartSystem {

    ArrayList<Item> productList = new ArrayList<>();

    void addProduct(Item p) {
        productList.add(p);
        System.out.println(p.name + " added to cart.");
    }

    void removeProduct(String productName) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name.equalsIgnoreCase(productName)) {
                System.out.println(productList.get(i).name + " removed from cart.");
                productList.remove(i);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    double calculateTotalCost() {
        double total = 0;

        for (Item p : productList) {
            total += p.price;
        }

        return total;
    }

    void displayCart() {
        if (productList.size() == 0) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("Products in Cart:");
        for (Item p : productList) {
            System.out.println(p.name + " - ₹" + p.price);
        }

        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("----------------------");
    }
}

public class ShoppingTest {

    public static void main(String[] args) {

        CartSystem cart = new CartSystem();

        Item p1 = new Item("Laptop", 50000);
        Item p2 = new Item("Mouse", 800);
        Item p3 = new Item("Keyboard", 1500);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        cart.removeProduct("Mouse");

        cart.displayCart();
    }
}
