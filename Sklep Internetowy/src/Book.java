import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Product {
    String genre;
    String author;
    String powiesc;
    private static List<Book> bookList = new ArrayList<>();

    public Book(String name, double price, int id, String category, String genre, String author, String powiesc){
        super(name, price, id, category);
        this.genre = genre;
        this.author = author;
        this.powiesc = powiesc;

    }

    public static void initializeBooks() {
        if (bookList.isEmpty()) { // żeby nie duplikować przy ponownym wejściu
            bookList.add(new Book("Wiedźmin: Ostatnie życzenie", 49.99, 1, "Ksiązki", "fantastyka", "Andrzej Sapkowski", "powiesc"));
            bookList.add(new Book("Harry Potter i Kamień Filozoficzny", 39.99, 2, "Książki", "fantasy", "J.K. Rowling", "powiesc"));
            bookList.add(new Book("Zbrodnia i kara", 44.50, 3, "Ksiązki", "klasyka", "Fiodor Dostojewski", "powiesc"));
            bookList.add(new Book("Mały Książę", 29.90, 4, "Ksiązki", "literatura dziecięca", "Antoine de Saint-Exupéry", "bajka"));
            bookList.add(new Book("1984", 35.00, 5, "Ksiązki", "dystopia", "George Orwell", "powiesc"));
            bookList.add(new Book("Hobbit", 42.99, 6, "Ksiązki", "fantasy", "J.R.R. Tolkien", "powiesc"));
            bookList.add(new Book("Pan Tadeusz", 33.00, 7, "Ksiązki", "epopeja", "Adam Mickiewicz", "klasyka"));
            bookList.add(new Book("Rok 1984", 38.99, 8, "Ksiązki", "dystopia", "George Orwell", "powiesc"));
        }
    }

    public static void displayBookType() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rodzaj książek ");
        System.out.println("1. Powieści");
        System.out.println("2. Klasyka");
        System.out.println("3. Bajki");
        System.out.println("x. Wróć do menu głównego");
        System.out.print("Wybierz opcję: ");
        String option = sc.next();
        switch (option) {
            case "1":
                // powieści
                break;
            case "2":
                // klasyka
                break;
            case "3":
                // fantasy
                break;
            case "x":
                Main.displayMenu();
                break;
            default:
                System.out.println("Nieprawidłowa opcja");
                break;
        }
    }

}
