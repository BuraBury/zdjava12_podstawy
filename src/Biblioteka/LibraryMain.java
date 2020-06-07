package Biblioteka;

import java.util.Scanner;

public class LibraryMain {

    static Scanner scanner = new Scanner(System.in);

    //metoda menu - wybor opcji funkcją switch:
    public static void menu(Library library) {
        System.out.println("***** MENU *****");
        System.out.println();
        System.out.println("Wybierz: ");

        System.out.println("1. Dostępne książki");
        System.out.println("2. Wypożycz");
        System.out.println("3. Oddaj");
        System.out.println("4. Lista klientów biblioteki");
        System.out.println("5. Dodaj nowego klienta");
        System.out.println("6. Usuń klienta");
        System.out.println("7. Dodaj nową książkę");
        System.out.println("8. Wyszukaj pozycję");

        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1: {
                //wypisz wszystie książki
                library.printBooks();
            }
            break;
            case 2: {
                //wypozycz
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
            }
            break;
            case 7: {
                //dodawanie ksiazki
                library.addBook();
            }
            break;
            case 8: {
                //wyszukaj pozycje po frazie
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wpisz frazę");
                String fraza = scanner.nextLine();

                library.searchBook(fraza);

                Book[] searchResult = library.searchBook(fraza);

                for (Book value : searchResult) {
                    System.out.println(value);
                }


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
