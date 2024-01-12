package module2.task2;

public class Colony {
    String name;
    int smetPrice;
    int apCount;
    Apartment[] aparts;
    public Colony(){}
    public Colony(String name, int smetPrice, int apCount){
        this.name = name;
        this. smetPrice = smetPrice;
        this.apCount = apCount;
    }
    public Colony(String name, int smetPrice, int apCount, Apartment[] aparts){
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.aparts = aparts;}

        public int getApCount(){
        return apCount;
        }
    public int priceAp(TypeApartment type, int smetPrice, int smet){
        int price = smetPrice * smet;
        switch(type){
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
       return price;
    }

    }



