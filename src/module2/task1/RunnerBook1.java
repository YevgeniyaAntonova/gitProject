package module2.task1;

public class RunnerBook1 {
    public  static void main(String[] args) {
        Book1 WandP = new Book1("War_and_Peace", "Tolstoy", 5000, Type.CLASSICAL);
        Book1 Kodzima = new Book1("Kodzima_genius", "Wulf", 8000, Type.BESTSELLER);
        Book1 Hobbit = new Book1("Hobbit", "Tolkien", 9500, Type.CLASSICAL);
        Book1 Potter = new Book1("Potter", "Rowling", 10000, Type.SIMPLE);
        WandP.print(WandP.name, WandP.author, WandP.price);
        Kodzima.print(Kodzima.name, Kodzima.author, Kodzima.price);
        Hobbit.print(Hobbit.name, Hobbit.author, Hobbit.price);
        Potter.print(Potter.name, Potter.author, Potter.price);
    }


}
