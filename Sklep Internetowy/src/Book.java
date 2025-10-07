public class Book extends Product {
    String genre;
    String author;
    public Book(String name, double price, int id, String category, String genre, String author){
        super(name, price, id, category);
        this.genre = genre;
        this.author = author;
    }
}
