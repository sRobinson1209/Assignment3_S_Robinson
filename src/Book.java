

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title,String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle()
    {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Title: " + title + "," + " Author: " + author + "," + " Price: " + price + "\n";
    }
}
