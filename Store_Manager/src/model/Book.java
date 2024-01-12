package model;

public class Book extends Product {
    private int yearPublished;
    private String genre;

    public Book() {
    }

    public Book(String productID, String title, String author, String publisher, double price, int quantity, int yearPublished, String genre) {
        super(productID, title, author, publisher, price, quantity);
        this.yearPublished = yearPublished;
        this.genre = genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "productID='" + getProductID() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publisher='" + getPublisher() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", yearPublished=" + yearPublished +
                ", genre='" + genre + '\'' +
                '}';
    }
}
