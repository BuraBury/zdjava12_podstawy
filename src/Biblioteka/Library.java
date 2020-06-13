package Biblioteka;

import java.util.Scanner;

public class Library {

    private Book[] books;
    private Client[] clients;
    private int firstEmptyIndex;
    private int firstEmptyId;
    private static final int MAX_BOOKS_COUNT = 101;
    private static final int MAX_CLIENTS_COUNT = 100;


    public Library() {
        this.books = new Book[MAX_BOOKS_COUNT];
        this.firstEmptyIndex = 0;
        this.clients = new Client[MAX_CLIENTS_COUNT];
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
        int a = 0;
        for (Book book : books) {
            if (book != null) {
                book.setBookId(a);
                a++;
            }
        }
        return books;
    }

    public void addKlient(Client client) {
        this.clients[firstEmptyId] = client;
        firstEmptyId++;
    }

    public void addKlient() {
        Client newOne = new Client();
        System.out.println("Podaj imię i nazwisko nowego klienta: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        newOne.setClientName(name);

        this.clients[firstEmptyId] = newOne;
        firstEmptyId++;
    }

    public Client[] removeClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID klienta do usunięcia: ");
        int id = scanner.nextInt();
        int a = 0;

        for (int i = 0; i < clients.length; i++) {
            if (id == i) {
                clients[i] = null;
            }
        }
        for (Client client : clients) {
            if (client != null) {
                client.setClientID(a);
                a++;
            }
        }
        return clients;
    }

    public void printBooks() {
        for (Book book : books) {
            if (book == null || book.getTitle().contains("WYPOŻYCZONA")) {
                continue;
            } else {
                System.out.println(book);
            }
        }
    }

    public void printClients() {
        for (Client client : clients) {
            if (client == null) {
                continue;
            } else {
                System.out.println(client);
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

        for (Book book : searchResult) {

            if (book != null) {
                searchResultToReturn[actualIndex] = book;
                actualIndex++;
            }

        }

        return searchResultToReturn;
    }

    public Book[] borrowBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID książki do wypożyczenia");
        int idBook = scanner.nextInt();
        System.out.println("Podaj ID klienta");
        int idClient = scanner.nextInt();

        Book[] borrowedBooks = new Book[MAX_BOOKS_COUNT];

        for (int i = 0; i < books.length; i++) {
            if (idBook == i) {
                books[i].setTitle(books[i].getTitle() + "\nPOZYCJA WYPOŻYCZONA \n" + "Osoba wypożyczająca: " + clients[idClient].getClientName());
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
