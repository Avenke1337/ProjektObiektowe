import java.util.Scanner;

public class Electronics extends Product {
    String brand;
    String type;
    public Electronics(String name, double price, int id, String category, String brand, String type){
        super(name, price, id, category);
        this.brand = brand;
        this.type = type;
    }
    public static void displayElectronicsType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rodzaj produktow ");
        System.out.println("1. AGD");
        System.out.println("2. RTV");
        System.out.println("3. GAMING");
        System.out.println("4. Telefony ");
        System.out.println("x. Wroc do menu glownego");
        System.out.print("Wybierz opcje: ");
        String option = sc.next();


    }
}
