import java.util.*;



public class Cart extends Product {
    public static List<Product> cart = new ArrayList<>();

    public Cart(String name, double price, int id, String category) {
        super(name, price, id, category);
    }

    public static void addToCart(Product product){
        cart.add(product);
    }
    public static void removeFromCart(Product product){
        cart.remove(product);
    }
    public static void displayCart(){
        for (Product product : cart){
            System.out.println(product);
        }
    }
    public static void showTotalPrice{
        int suma = 0;
        for (Product p : cart){
            suma += p.price;
        }
    }
}
