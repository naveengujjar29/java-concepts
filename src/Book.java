/**
 *
 * Create a class Book with properties title, author, and price.
 *
 *
 * Create an object of this class and display its properties.
 *
 */

public class Book {

    private String title;

    private String author;

    private double price;


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // Override toString() method

//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                '}';
//    }

    public static void main(String[] args) {
        Book book = new Book(); // Object creation
        book.setAuthor("Chtean Bhagat");
        book.setTitle("3 Muskeeter");;
        book.setPrice(100.34);

        System.out.println(book);

    }
}
