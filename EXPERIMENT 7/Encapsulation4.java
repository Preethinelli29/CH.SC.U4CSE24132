class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price); // use setter to apply validation
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }
}

public class Encapsulation4 {
    public static void main(String[] args) {
        Book b = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 299);

        System.out.println("Book: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: ₹" + b.getPrice());
    }
}
