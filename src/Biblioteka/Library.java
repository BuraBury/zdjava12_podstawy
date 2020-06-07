package Biblioteka;

import java.util.Arrays;

public class Library {

    Book[] array = new Book[200];


    public void addBook(Book[] array, Book newBook) {
        Arrays.fill(array, newBook);
    }

    @Override
    public String toString() {
        return "Library{" +
                "array=" + Arrays.toString(array) +
                '}';
    }


//   public void listOfBooks() {
//        for (Book books : this.book) {
//            System.out.println(book.toString());
//        }
//        int librarySize = books.size();
//        System.out.println("Ilość książek: " + bookSize + " książek");
//    }


    public static void main(String[] args) {

        Library library1 = new Library();
        Book[] booksOfLibrary1 = new Book[20];

        Book book1 = new Book("Pan Tadeusz", "Adam", "Mickiewicz", true);
        Book book2 = new Book("Przedwiośnie", "Stefan", "Żeromski", true);
        Book book3 = new Book("Lalka", "Bolesław", "Prus", true);
        Book book4 = new Book("Hamlet", "William", "Shakespeare", true);

        library1.addBook(booksOfLibrary1, book1);
        library1.addBook(booksOfLibrary1, book2);
        library1.addBook(booksOfLibrary1, book3);
        library1.addBook(booksOfLibrary1, book4);



    }

}
