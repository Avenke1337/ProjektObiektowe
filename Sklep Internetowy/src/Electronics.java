import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Electronics extends Product {
    String brand;
    String type;
    private static List<Electronics> electronicsList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public Electronics(String name, double price, int id, String category, String brand, String type){
        super(name, price, id, category);
        this.brand = brand;
        this.type = type;
    }

    public static void initializeProducts() {
        if (electronicsList.isEmpty()) { // żeby nie duplikować przy ponownym wejściu
            electronicsList.add(new Electronics("Pralka Samsung", 1899.99, 1, "Elektronika", "Samsung", "AGD"));
            electronicsList.add(new Electronics("Lodówka LG", 2799.49, 2, "Elektronika", "LG", "AGD"));
            electronicsList.add(new Electronics("Telewizor Sony 55\"", 3499.00, 3, "Elektronika", "Sony", "RTV"));
            electronicsList.add(new Electronics("Soundbar JBL", 999.00, 4, "Elektronika", "JBL", "RTV"));
            electronicsList.add(new Electronics("Konsola PlayStation 5", 2999.00, 5, "Elektronika", "Sony", "GAMING"));
            electronicsList.add(new Electronics("Monitor ASUS 144Hz", 1099.00, 6, "Elektronika", "ASUS", "GAMING"));
            electronicsList.add(new Electronics("iPhone 15", 4999.00, 7, "Elektronika", "Apple", "Telefony"));
            electronicsList.add(new Electronics("Samsung Galaxy S24", 4499.00, 8, "Elektronika", "Samsung", "Telefony"));
        }
    }



    public static void displayElectronicsType(){
        initializeProducts();

        System.out.println("Wybierz rodzaj produktow ");
        System.out.println("1. AGD");
        System.out.println("2. RTV");
        System.out.println("3. GAMING");
        System.out.println("4. Telefony ");
        System.out.println("x. Wroc do menu glownego");
        System.out.print("Wybierz opcje: ");
        String option = sc.next();
            switch(option){
                case "1":
                    showAvailableElectronicsByType("AGD");
                    break;
                case "2":
                    showAvailableElectronicsByType("RTV");
                    break;
                case "3":
                    showAvailableElectronicsByType("GAMING");
                    break;
                case "4":
                    showAvailableElectronicsByType("Telefony");
                    break;
                case "x":
                    Main.displayMenu();
                    break;
                default:
                    System.out.println("Nieprawidlowa opcja");
                    break;
            }

    }
    public static void showAvailableElectronicsByType(String type) {
        List<Electronics> sortedElectronicsList = new ArrayList<>();
        for (int i = 0; i < electronicsList.toArray().length; i++) {
            Electronics electronics = electronicsList.get(i);
            if (electronics.type.equals(type)) {
                System.out.println(i + 1 + ". " + electronics);
                sortedElectronicsList.add(electronics);
            }
        }
        System.out.println("Dodaj produkty do koszyka (wpisz numer produktu)");
        int index = sc.nextInt();
        Cart.addToCart(sortedElectronicsList.get(index - 1));

    }
}
