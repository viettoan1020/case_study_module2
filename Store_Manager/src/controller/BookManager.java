package controller;
import java.io.IOException;
import java.util.List;

import model.Book;
import util.FileUtil;

public class BookManager extends AbstractManager<Book>{

    public void addBook(String productID, String title, String author, String publisher, double price, int quantity, int yearPublished, String genre) {
        Book book = new Book(productID, title, author,publisher, price, quantity, yearPublished, genre);
        addItem(book);
    }

    public void editBook(String productID, String title, String author, String publisher, double price, int quantity, int yearPublished, String genre) {
        Book updatedBook = new Book(productID, title, author, publisher, price, quantity, yearPublished, genre);
        editItem(productID, updatedBook);
    }

    public void deleteBook(String itemId){
        deleteItem(itemId);
        System.out.println("Delete book success");
    }
    public void updatedBook(String bookId,Book book){
        editItem(bookId, book);
        System.out.println(" Update book success");
    }
    public void test(){
        this.displayAllItems();
    }

    @Override
    public void writeFile() throws IOException {
        List<Book> listBook = this.itemList;
        FileUtil fileUtil = FileUtil.GetInstance();
        fileUtil.writeFile(listBook);
    }
}