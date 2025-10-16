import java.util.*;



public class Cart {
    public static List<Product> cart = new ArrayList<>();
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
}
