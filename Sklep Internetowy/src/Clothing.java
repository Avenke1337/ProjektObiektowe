public class Clothing extends Product{
    String size;
    String brand;
    public Clothing(String name, double price, int id, String category, String size, String brand){
        super(name, price, id, category);
        this.size = size;
        this.brand = brand;
    }
}
