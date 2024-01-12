package module2.task2;

import java.util.ArrayList;

public class Colony {
    String name;
    int smetPrice;
    int apCount;
    Apartment apart;

    public Colony() {
    }

    public Colony(String name, int smetPrice, int apCount, ArrayList<Apartment> aparts) {
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.apart = apart;
    }

    public Apartment getApart() {
        return apart;
    }

    public void setApart(Apartment apart) {
        this.apart = apart;
    }


    public int priceAp(TypeApartment type, int smetPrice, int smet) {
        int price = smetPrice * smet;
        //for (int i = 0; i < apCount; i++) {

            switch (type) {
                case Carbonpanel -> {
                    price = (int) (0.8 * price);
                    break;
                }
                case Cyberbricks -> {
                    price = (int) (1.5 * price);
                    break;
                }
                case Nanolite -> {
                    price = price;
                    break;
                }
            }
    //}
            return price;


    }
}



