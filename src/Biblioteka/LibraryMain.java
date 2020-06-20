package Biblioteka;

import java.util.Scanner;

public class LibraryMain {
    static Scanner scanner = new Scanner(System.in);

    static public int input() {
        return scanner.nextInt();
    }

    public static Library loadLibrary() {
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
        Client client = new Client("Paulina Bury");
        Client client1 = new Client("Jakub Nagiet");
        Client client2 = new Client("Bercik Albert Gwidon Bercicky");
        Client client3 = new Client("Artur Nawałka");

        //dodanie klientow do biblioteki
        library.addKlient(client);
        library.addKlient(client1);
        library.addKlient(client2);
        library.addKlient(client3);

        return library;
    }

    static void inputBookId_info() {
        System.out.println("Podaj ID książki do wypożyczenia");
    }

    static void inputClientId_info() {
        System.out.println("Podaj ID klienta");
    }

    public static void showMenu() {
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
    }

    public static void menuChoice(Library library) {
        showMenu();

        int choice = input();

        switch (choice) {
            case 1: {
                //wypisz wszystie książki
                library.printBooks();
            }
            break;
            case 2: {
                //wypozycz
                library.borrowBook();
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

        Library mojaBiblioteka = loadLibrary();

        //wywolanie metody menu();
        while (true) {
            menuChoice(mojaBiblioteka);
        }


    }

}
