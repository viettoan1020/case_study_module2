public class BookManager extends AbstractManager<Book>{

    public void addBook(String productID, String title, String author, String publisher, double price, int quantity, int yearPublished, String genre) {
        Book book = new Book(productID, title, author,publisher, price, quantity, yearPublished, genre);
        addItem(book);
    }

    public void editBook(String productID, String title, String author, String publisher, double price, int quantity, int yearPublished, String genre) {
        Book updatedBook = new Book(productID, title, author, publisher, price, quantity, yearPublished, genre);
        editItem(productID, updatedBook);
    }

    @Override
    public void exportToExcel() {

    }
    @Override
    public void importFromExcel() {

    }
}
