package Java_15;

public class Book {
    //tao bien
    private String name;
    private Author Author;
    private double price;
    private int qty = 0;

    //tao constructor
    public Book(String name,  Author Author, double price){
        this.name = name;
        this.Author = Author;
        this.price = price;
    }
    //tao contructor them qty
    public Book(String name, Author Author, double price, int qty){
        this.name = name;
        this.Author = Author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.Author;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    //mo ta cach the hien
    public String toString(){
        return String.format("Name: " + name + "Price: " + price + "Qty: " + qty);
    }
}
