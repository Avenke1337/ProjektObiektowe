import java.util.Scanner;

class Main{

   public static void main(String[] args) {

//       System.out.print("Podaj imie: ");
//       String name = sc.next();
//       System.out.print("Podaj email: ");
//       String email = sc.next();
//       User user = new User(name, email);
//       System.out.println(user);
    Electronics.initializeProducts();
    Clothing.initializeClothing();
    Book.initializeBooks();
    displayMenu();


   }
    public static void displayMenu(){
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Wyswietl dostepne kategorie");
            System.out.println("x: Wyjdz");
            System.out.print("Wybierz opcje: ");
            String option = sc.next();

            switch (option) {
                case "1":
                    System.out.println("Dostepne kategorie:");
                    System.out.println("1. Elektronika");
                    System.out.println("2. Ksiazki");
                    System.out.println("3. Ubrania");
                    option = sc.next();
                    switch (option) {
                        case "1":
                            Electronics.displayElectronicsType();
                            break;
                       case "2":
                           Book.displayBookType();
                           break;
                       case "3":
                           Clothing.displayClothingType();
                           break;
                        case "x":
                            isRunning = false;
                            break;
                        default:
                            System.out.println("Nieprawidlowa opcja");
                            break;
                    }
                    break;
                case "x":
                    System.out.println("Do zobaczenia!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Nieprawidlowa opcja");
                    break;
            }
        }
        Cart.displayCart();
    }
}