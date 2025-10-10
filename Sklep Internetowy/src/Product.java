public class Product {
    private String name;
    private double price;
    private int ProductId;
    private String category;

    public Product(String name, double price, int id, String category){
        this.name = name;
        this.price = price;
        this.ProductId = id;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getProductId(){
        return ProductId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(Float price){
        this.price = price;
    }

    public void setProductId(int id){
        this.ProductId = id;
    }

    @Override
    public String toString(){
        return  this.name + ", cena: " + this.price + "PLN";
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
