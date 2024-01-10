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
    public void displayBookInfo() {
        System.out.println("Book Information :");
        System.out.println("Title : " + getTitle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Pushlisher " + getPublisher());
        System.out.println("Price : " + getPrice());
        System.out.println("Quantity : " + getQuantity() );
        System.out.println("Year Published" + yearPublished);
        System.out.println("Genre : " + genre);
    }
}
