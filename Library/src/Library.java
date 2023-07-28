import java.util.ArrayList;

class Library {
    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Список доступных книг:");
        for (Book book : catalog) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String authorName) {
        System.out.println("Книги автора " + authorName + ":");
        for (Book book : catalog) {
            if (book.getAuthor().equals(authorName)) {
                book.displayInfo();
            }
        }
    }
}