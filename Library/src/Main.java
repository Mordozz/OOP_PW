public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Война и Мир", "Толстой Л.Н.");
        Book book2 = new Book("Над пропастью во ржи", "Джером Д. Селинджер");

        library.addBook(book1);
        library.addBook(book2);
        book1.setAvailable(false);
        library.displayAvailableBooks();
        library.searchByAuthor("Толстой Л.Н.");
    }
}