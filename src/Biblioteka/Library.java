package Biblioteka;

import java.util.Scanner;

public class Library {

    private Book[] books;
    private Klient[] klients;
    private int firstEmptyIndex;
    private int firstEmptyId;
    private static final int MAX_BOOKS_COUNT = 100;
    private static final int MAX_KLIENTS_COUNT = 100;


    public Library() {
        this.books = new Book[MAX_BOOKS_COUNT];
        this.firstEmptyIndex = 0;
        this.klients = new Klient[MAX_KLIENTS_COUNT];
        this.firstEmptyId = 0;
    }

    public void addBook() {
        Book newOne = new Book();
        System.out.println("Podaj autora dodawanej książki: ");
        Scanner scanner = new Scanner(System.in);
        String autor = scanner.nextLine();
        newOne.setAuthor(autor);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj tytuł: ");
        String tytul = scanner1.nextLine();
        newOne.setTitle(tytul);

        this.books[firstEmptyIndex] = newOne;
        firstEmptyIndex++;
    }

    public void addBook(Book book) {
        this.books[firstEmptyIndex] = book;
        firstEmptyIndex++;
    }

    public Book[] removeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID książki do usunięcia: ");
        int id = scanner.nextInt();

        for (int i = 0; i < books.length; i++) {
            if (id == i) {
                books[i] = null;
            }
        }
        return books;
    }

    public void addKlient(Klient klient) {
        this.klients[firstEmptyId] = klient;
        firstEmptyId++;
    }

    public void addKlient() {
        Klient newOne = new Klient();
        System.out.println("Podaj imię i nazwisko nowego klienta: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        newOne.setClientName(name);

        this.klients[firstEmptyId] = newOne;
        firstEmptyId++;
    }

    public Klient[] removeClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID klienta do usunięcia: ");
        int id = scanner.nextInt();

        for (int i = 0; i < klients.length; i++) {
            if (id == i) {
                klients[i] = null;
            }
        }
        return klients;
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null || books[i].getTitle().contains("WYPOŻYCZONA")) {
                continue;
            } else {
                System.out.println(books[i]);
            }
        }
    }

    public void printClients() {
        for (int i = 0; i < klients.length; i++) {
            if (klients[i] == null) {
                continue;
            } else {
                System.out.println(klients[i]);
            }
        }
    }

    public Book[] searchBook(String searchQuery) {

        Book[] searchResult = new Book[MAX_BOOKS_COUNT];

        int foundBooksCount = 0;

        for (int i = 0; i < this.firstEmptyIndex; i++) {
            Book bookToCheck = this.books[i];

            boolean authorCheck = bookToCheck.getAuthor().contains(searchQuery);
            boolean titleCheck = bookToCheck.getTitle().contains(searchQuery);

            if (authorCheck || titleCheck) {
                searchResult[i] = bookToCheck;
                foundBooksCount++;
            }
        }

        int actualIndex = 0;
        Book[] searchResultToReturn = new Book[foundBooksCount];

        for (int i = 0; i < searchResult.length; i++) {

            if (searchResult[i] != null) {
                searchResultToReturn[actualIndex] = searchResult[i];
                actualIndex++;
            }

        }

        return searchResultToReturn;
    }

    public Book[] getBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID książki do wypożyczenia");
        int idBook = scanner.nextInt();
        System.out.println("Podaj ID klienta");
        int idClient = scanner.nextInt();

        Book[] borrowedBooks = new Book[MAX_BOOKS_COUNT];

        for (int i = 0; i < books.length; i++) {
            if (idBook == i) {
                books[i].setTitle(books[i].getTitle() + "\nPOZYCJA WYPOŻYCZONA \n" + "Osoba wypożyczająca: " + klients[idClient].getClientName());
                borrowedBooks[i] = books[i];
            }
        }

        System.out.println("Wypozyczone pozycje: ");
        for (Book borrowedBook : borrowedBooks) {
            if (borrowedBook == null) {
                continue;
            } else {
                System.out.println(borrowedBook);
            }
        }

        return books;
    }

    public Book[] returnBook() {

        return null;
    }


}
