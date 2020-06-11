package Biblioteka;

import java.util.Scanner;

public class LibraryMain {

    static Scanner scanner = new Scanner(System.in);

    //metoda menu - wybor opcji funkcją switch:
    public static void menu(Library library) {

        System.out.println("\n***** MENU *****\n\n" +
                "\tWybierz:\n" +
                "1. Dostępne książki\n" +
                "2. Wypożcz\n" +
                "3. Oddaj\n" +
                "4. Lista klientów\n" +
                "5. Dodaj nowego klienta\n" +
                "6. Usuń klienta\n" +
                "7. Dodaj nową książkę\n" +
                "8. Usuń książkę\n" +
                "9. Wyszukaj pozycję");

        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1: {
                //wypisz wszystie książki
                library.printBooks();
            }
            break;
            case 2: {
                //wypozycz
                library.getBook();
            }
            break;
            case 3: {
                //oddaj
            }
            break;
            case 4: {
                //wypisz wszystkich klientów biblioteki
                library.printClients();
            }
            break;
            case 5: {
                //dodawanie nowego klienta
                library.addKlient();
            }
            break;
            case 6: {
                //usun klienta
                library.removeClient();
            }
            break;
            case 7: {
                //dodawanie ksiazki
                library.addBook();
            }
            break;
            case 8: {
                //usuwanie ksiazki po autorze
                library.removeBook();
            }
            case 9: {
                //wyszukaj pozycje po frazie
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Wpisz frazę");
//                String fraza = scanner.nextLine();
//
//                library.searchBook(fraza);
//
//                Book[] searchResult = library.searchBook(fraza);
//
//                for (Book value : searchResult) {
//                    System.out.println(value);
//                }


            }
            break;
        }
    }


    public static void main(String[] args) {

        //stworzenie instacji biblioteki "library"
        Library library = new Library();

        //stworzenie instancji książek "book"
        Book book = new Book("Pan Tadeusz", "Adam Miciewicz");
        Book book1 = new Book("Przedwiośnie", "Stefan Żeromski");
        Book book2 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz");

        //dodanie metodą addBook(); ksiazek do library
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);

        //stworzenie instancji klienta 'klient'
        Klient klient = new Klient("Paulina Bury");
        Klient klient1 = new Klient("Jakub Nagiet");
        Klient klient2 = new Klient("Bercik Albert Gwidon Bercicky");
        Klient klient3 = new Klient("Artur Nawałka");

        //dodanie klientow do biblioteki
        library.addKlient(klient);
        library.addKlient(klient1);
        library.addKlient(klient2);
        library.addKlient(klient3);

        //wywolanie metody menu();
        while (true) {
            menu(library);
        }
//
//        Book[] searchResult = library.searchBook("Henryk");
//
//        for (Book value : searchResult) {
//            System.out.println(value);
//        }


    }

}
