public class Book {
    private int quantity;
    private String name;
    private String author;
    private int year;

    public Book(int number, String name, String author, int year) {
        this.quantity = number;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int number) {
        this.quantity = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + quantity +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
