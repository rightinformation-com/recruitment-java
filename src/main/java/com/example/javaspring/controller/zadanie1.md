### Zadanie 1
Obecnie w aplikacji użytkownicy mają tylko możliwość podglądu swoich urządzeń. 
Zaimplementuj możliwość dodawania nowych urządzeń użytkownika

1. Stwórz endpoint POST /devices, który umożliwia dodanie nowego urządzenia.
2. Dodaj walidację: serialNumber nie może być pusty
3. Zwróć kod HTTP 201 Created, stworzony zasób oraz URI do niego w nagłówku Location

