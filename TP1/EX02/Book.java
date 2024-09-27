//Aluna: Laysa Bernardes Campos da Rocha - CB3024873 
//Aluno: Lucas Lopes Cruz - CB3025284 

package EX02;
import EX01.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Construtor sem a quantidade (qty)
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    //getters
    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }

    //setters
    public void setPrice(double price){
        this.price = price;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String getAuthorNames(){
        StringBuilder authorsString = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsString.append(authors[i].getName());
            if (i < authors.length - 1) {
                authorsString.append(", ");
            }
        }
        return authorsString.toString();
    }

    @Override
    public String toString(){
        StringBuilder authorsString = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorsString.append("Author[name=" + authors[i].getName() 
                + ",email=" + authors[i].getEmail() 
                + ",gender=" + authors[i].getGender() + "]");
            if (i < authors.length - 1) {
                authorsString.append(", ");
            }
        }
        return "Book[name=" + name + ",authors={" + authorsString.toString() + "},price=" + price + ",qty=" + qty + "]";
    }

}
