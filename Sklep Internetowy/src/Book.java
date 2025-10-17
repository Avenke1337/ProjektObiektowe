import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Product {
    String genre;
    String author;
    String type;
    private static List<Book> bookList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    public Book(String name, double price, int id, String category, String genre, String author, String type){
        super(name, price, id, category);
        this.genre = genre;
        this.author = author;
        this.type = type;


    }

    public static void initializeBooks() {
        if (bookList.isEmpty()) { // żeby nie duplikować przy ponownym wejściu
            bookList.add(new Book("Wiedźmin: Ostatnie życzenie", 49.99, 1, "Ksiązki", "fantastyka", "Andrzej Sapkowski", "Powiesc"));
            bookList.add(new Book("Harry Potter i Kamień Filozoficzny", 39.99, 2, "Książki", "fantasy", "J.K. Rowling", "Powiesc"));
            bookList.add(new Book("Zbrodnia i kara", 44.50, 3, "Ksiązki", "klasyka", "Fiodor Dostojewski", "Powiesc"));
            bookList.add(new Book("Mały Książę", 29.90, 4, "Ksiązki", "literatura dziecięca", "Antoine de Saint-Exupéry", "Bajka"));
            bookList.add(new Book("1984", 35.00, 5, "Ksiązki", "dystopia", "George Orwell", "Powiesc"));
            bookList.add(new Book("Hobbit", 42.99, 6, "Ksiązki", "fantasy", "J.R.R. Tolkien", "Powiesc"));
            bookList.add(new Book("Pan Tadeusz", 33.00, 7, "Ksiązki", "epopeja", "Adam Mickiewicz", "Klasyka"));
            bookList.add(new Book("Rok 1984", 38.99, 8, "Ksiązki", "dystopia", "George Orwell", "Powiesc"));
        }
    }

    public static void displayBookType() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rodzaj książek ");
        System.out.println("1. Powiesci");
        System.out.println("2. Klasyka");
        System.out.println("3. Bajki");
        System.out.println("x. Wróć do menu głównego");
        System.out.print("Wybierz opcję: ");
        String option = sc.next();
        switch (option) {
            case "1":
                showAvailableBookByType("Powiesc");
                break;
            case "2":
                showAvailableBookByType("Klasyka");
                break;
            case "3":
                showAvailableBookByType("Bajki");
                break;
            case "x":
                Main.displayMenu();
                break;
            default:
                System.out.println("Nieprawidłowa opcja");
                break;
        }
    }
    public static void showAvailableBookByType(String type) {
        List<Book> sortedBookList = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < bookList.toArray().length; i++) {
            Book book = bookList.get(i);
            if (book.type.equals(type)) {
                System.out.println(counter+ ". " + book);
                sortedBookList.add(book);
                counter++;
            }
        }
        System.out.println("Dodaj produkty do koszyka (wpisz numer produktu)");
        int index = sc.nextInt();
        Cart.addToCart(sortedBookList.get(index - 1));

    }

}