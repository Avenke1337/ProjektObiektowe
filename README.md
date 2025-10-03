Klasa bazowa: Product

Atrybuty:
name – nazwa produktu (np. "Harry Potter")
price – cena produktu (np. 59.99)
id – unikalny identyfikator produktu
To jest klasa ogólna, z której będą dziedziczyć konkretne typy produktów.

2. Klasy dziedziczące (rozszerzające klasę Product)

Book
Dziedziczy name, price, id
author

Electronics
Dziedziczy name, price, id
brand, warranty

Clothing
Dziedziczy name, price, id
 size, color



3. Interfejs: Discountable
Metoda: applyDiscount()
Ten interfejs może być implementowany przez każdą z klas dziedziczących.

4. Card
koszyk


5. Klasa główna: Main

Tworzy listę produktów różnych typów (Book, Electronics, Clothing)
Zastosowuje zniżki poprzez wywołanie applyDiscount() dla obiektów implementujących Discountable
Wyświetla zawartość koszyka (listę produktów z ich cenami po zniżkach)
