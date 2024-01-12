package module2.task2;

public class Book {
    public String name;
    public Author author;
    public double price;
    public int qty;
    public Book(String name, Author author,double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author,double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return String.format("Book[name=%s, Author[name=%s, email=%s, gender=%s], price=%f, qty=%d]", this.name, author.getName(), author.getEmail(),author.getGender(), price, qty);
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }

}
