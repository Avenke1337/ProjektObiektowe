Projekt sklepu internetowego
Opis

Projekt demonstruje podejście obiektowe w Javie na przykładzie sklepu internetowego.
Zawiera hierarchię klas reprezentujących produkty (książki, elektronikę, ubrania), interfejs rabatowy oraz klasę koszyka umożliwiającą dodawanie produktów, obliczanie cen i stosowanie rabatów.

Celem projektu jest pokazanie:

dziedziczenia,

polimorfizmu,

wykorzystania interfejsów,

enkapsulacji,

oraz prostego przepływu działania programu w klasie Main.

Struktura projektu
Klasy i interfejsy
- Product

Klasa abstrakcyjna, bazowa dla wszystkich produktów.

Posiada podstawowe atrybuty: name, price, id.

Definiuje wspólne zachowania (toString(), gettery/settery).

- Book

Dziedziczy po Product.

Dodatkowe atrybuty: author.

Może implementować interfejs Discountable, aby obsługiwać rabaty (np. zniżka na książki).

- Electronics

Dziedziczy po Product.

Dodatkowe atrybuty: brand, warranty (gwarancja w miesiącach).

Może implementować Discountable, np. rabat uzależniony od długości gwarancji.

- Clothing

Dziedziczy po Product.

Dodatkowe atrybuty: size, color.

Może implementować Discountable, np. sezonowe obniżki cen.

Discountable (interfejs)

Deklaruje metodę applyDiscount().

Umożliwia różnym klasom własną implementację mechanizmu rabatowego.

- Cart

Reprezentuje koszyk zakupowy.

Przechowuje listę produktów.

Główne metody:

addProduct(Product p) – dodawanie produktów,

applyDiscounts() – stosuje rabaty dla wszystkich elementów implementujących Discountable,

totalPriceBeforeDiscounts() – suma cen przed rabatami,

totalPriceAfterDiscounts() – suma cen po rabatach,

printCartContents() – wypisuje zawartość koszyka.

- Main

Klasa uruchomieniowa.

Tworzy przykładowe produkty (Book, Electronics, Clothing), dodaje je do koszyka, nakłada rabaty i prezentuje zawartość koszyka.
