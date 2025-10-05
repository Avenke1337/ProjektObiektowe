public class Product {
    private String name;
    private double price;
    private int ProductId;

//    public Product(String name, double price, int id){
//        this.name = name;
//        this.price = price;
//        this.ProductId = id;
//    }

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
        return "Product [name=" + this.name + ", price=" + this.price + "$" + ", id=" + this.ProductId + "]";
    }



}
