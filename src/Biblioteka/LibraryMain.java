package Biblioteka;

public class LibraryMain {



    public static void main(String[] args) {

        Library library = new Library();
        Book book = new Book("Pan Tadeusz", "Adam Miciewicz");
        Book book1 = new Book("Przedwiośnie", "Stefan Żeromski");
        Book book2 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz");

        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        //library.printBook();

      Book[] searchResult =  library.searchBook("Henryk");

        for (Book value : searchResult) {
            System.out.println(value);
        }








    }

}
