package module2.task2;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;

public class Apartment {
    String title;
    int smet;
    TypeApartment type;
    public Apartment(){}
    public Apartment(String title, int smet, String type){
        this.title = title;
        this.smet = smet;
        this.type = TypeApartment.valueOf(type);
    }




}
