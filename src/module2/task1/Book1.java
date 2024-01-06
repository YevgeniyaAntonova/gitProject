package module2.task1;

public class Book1 {
    String name;
    String author;
    double price;
    Type type;
    public Book1(){}
    public Book1(String name, String author, double price, Type type){
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
    public double price(double price, Type type){
        switch (type){
            case SIMPLE:
                price = price;
                break;
            case CLASSICAL:
                price = price - 0.1 * price;
                break;
            case BESTSELLER:
                price = price + 0.2 * price;
                break;
        }
        return price;
    }
    public void print(String name, String author, double price){
        System.out.printf("%s %s %.0f %n", name, author, price(price,type));
    }


}
