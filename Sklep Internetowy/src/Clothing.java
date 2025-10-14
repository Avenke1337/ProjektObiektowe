import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clothing extends Product{
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
                //koszulki
                break;
            case "2":
                //spodenki
                break;
            case "3":
                //bluzy
                break;
            case "x":
                Main.displayMenu();
                break;
            default:
                System.out.println("Nieprawidlowa opcja");
                break;
        }
    }
}