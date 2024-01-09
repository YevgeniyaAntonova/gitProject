package module2.task1;

public class Book2 {
    String title;
    int price;
    String type;
    int sold;
    public Book2(){}
    public Book2(String title, int price, String type, int sold){
        this.title = title;
        this.price = price;
        this.type = type;
        this.sold = sold;
    }
    public int income(int price, Type type, int sold){
        int income = 0;
        switch (type){
            case SIMPLE:
        if (sold >= 50){
            income = (int) (50 * price + (sold-50) * 1.2 * price);
        }else {
            income = price * sold;
        } break;
            case CLASSICAL:
                if (sold >= 50){
                    income = (int) (50 * 0.8 * price + (sold-50) * 0.96 * price);
                }else {
                    income = (int) (0.8 * price * sold);
                }break;
        }
        return income;

    }

    public String toString(int income) {
        return title + " " + income(price, Type.valueOf(type), sold);
    }
}
