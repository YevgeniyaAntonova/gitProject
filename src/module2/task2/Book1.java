package module2.task2;

import java.util.Arrays;

public class Book1 {

        public String name;
        public Author[] authors;
        public double price;
        public int qty;
        public Book1(String name, Author[] author,double price){
            this.name = name;
            this.authors = author;
            this.price = price;
        }
        public Book1(String name, Author[] author,double price, int qty){
            this.name = name;
            this.authors = author;
            this.price = price;
            this.qty = qty;
        }
        public String getName(){
            return name;
        }
        public Author[] getAuthor(){
            return authors;
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
            return String.format("Book[name=%s,authors{%s},price=%f,qty=%d]", this.name, Arrays.toString(authors), price, qty);
        }

    }


