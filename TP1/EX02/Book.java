package EX02;

import EX01.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Construtor sem a quantidade (qty)
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    // getters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        String authorsString = "";
        for (Author author : authors) {
            authorsString += author.getName() + ",";
        }
        return authorsString;
    }

    public String toString() {
        String authorsString = "";
        for (Author author : authors) {
            authorsString += author.toString() + ",";
        }
        return "Book[name=" + name + ",authors={" + authorsString + "},price=" + price + ",qty=" + qty
                + "]";
    }

}
