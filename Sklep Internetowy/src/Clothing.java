import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Clothing extends Product{
    static Scanner sc = new Scanner(System.in);
    String size;
    String brand;
    String type;
    private static List<Clothing> clothingList = new ArrayList<>();

    public Clothing(String name, double price, int id, String category, String size, String brand, String type){
        super(name, price, id, category);
        this.size = size;
        this.brand = brand;
        this.type = type;
    }

    public static void initializeClothing() {
        if (clothingList.isEmpty()) { // żeby nie duplikować przy ponownym wejściu
            clothingList.add(new Clothing("koszulka jp", 100.99, 1, "Ubrania", "l", "jp", "koszulki"));
            clothingList.add(new Clothing("bluza nike", 230.00, 2, "Ubrania", "m", "nike", "bluzy"));
            clothingList.add(new Clothing("spodenki denim tears", 900.00, 3, "Ubrania", "m", "denim tears", "spodenki"));
            clothingList.add(new Clothing("koszulka nike", 99.99, 4, "Ubrania", "xl", "nike", "koszulki"));
            clothingList.add(new Clothing("bluza czarna", 150.99, 5, "Ubrania", "s", "house", "bluzy"));
            clothingList.add(new Clothing("koszulka polo ralph lauren", 299.00, 6, "Ubrania", "s", "polo ralph lauren", "koszulki"));
            clothingList.add(new Clothing("spodenki nike szare", 120.99, 7, "Ubrania", "m", "nike", "spodenki"));
            clothingList.add(new Clothing("koszulka z gorylem", 99.99, 8, "Ubrania", "l", "shein", "koszulki"));
        }
    }

    public static void displayClothingType(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rodzaj ciuchow ");
        System.out.println("1. koszulki");
        System.out.println("2. spodenki");
        System.out.println("3. bluzy");
        System.out.println("x. Wroc do menu glownego");
        System.out.print("Wybierz opcje: ");
        String option = sc.next();
        switch(option){
            case "1":
                showAvailableClothingByType("koszulki");
                break;
            case "2":
                showAvailableClothingByType("spodenki");
                break;
            case "3":
                showAvailableClothingByType("bluzy");
                break;
            case "x":
                Main.displayMenu();
                break;
            default:
                System.out.println("Nieprawidlowa opcja");
                break;
        }
    }

    public static void showAvailableClothingByType(String type) {
        List<Clothing> sortedClothingList = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < clothingList.toArray().length; i++) {
            Clothing clothing = clothingList.get(i);
            if (clothing.type.equals(type)) {
                System.out.println(counter+ ". " + clothing);
                sortedClothingList.add(clothing);
                counter++;
            }
        }
        System.out.println("Dodaj produkty do koszyka (wpisz numer produktu)");
        int index = sc.nextInt();
        Cart.addToCart(sortedClothingList.get(index - 1));

    }
}