Projekt sklepu internetowego

!OPIS DZIALANIA KLAS I INTERFEJSU!


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



-------------------------------------------------------------------------------------------------------------------------------------------------------

Dzialanie programu:
1. Odpala sie menu z wyborem kategorii produktow/przejscia do koszyka
2. Pokazuje sie lista produktow z danej kategorii
3. Uzytkownik wybiera dany produkt
4. wpisuje ilosc produktu
5. dodaje produkt do koszyka
6. program wraca do menu początkowego
7. w przypadku wybraniu koszyka uzytkownik ma mozliwosc zakonczenia dzialania programu poprzez wybranie zakupu produktow
