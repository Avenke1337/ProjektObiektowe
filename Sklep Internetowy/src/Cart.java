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
        int counter = 1;
        if(cart.isEmpty()){
            System.out.println("Koszyk jest pusty");
        }else {
            for (Product product : cart) {
                System.out.println(counter + ". " + product);
                counter++;
            }
        }
    }
    public static void showTotalPrice(){
        float suma = 0;
        for (Product p : cart){
            suma += p.getPrice();
        }
        System.out.println("Łączna cena wszystkich produktów w koszyku: " +suma +"PLN");
    }
    public static double getTotalPrice(){
        float suma = 0;
        for (Product p : cart){
            suma += p.getPrice();
        }
        return suma;
    }
}
