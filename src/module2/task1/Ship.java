package module2.task1;

public class Ship {
    String name;
    String arrival_time;
    int stay_time;
    boolean is_distress;
    public Ship(){}
    public Ship(String name, String arrival_time, int stay_time, boolean is_distress){
        this.name = name;
        this.arrival_time = arrival_time;
        this.stay_time = stay_time;
        this.is_distress = is_distress;
    }
    public void allowedShips(String name, String arrival_time, int stay_time, boolean is_distress){
        int arrivalMinutes = Integer.parseInt(arrival_time.split(":")[0])*60 + Integer.parseInt(arrival_time.split(":")[1]);
        if (is_distress == true){
            System.out.printf("%s %n", name);
        } else if(arrivalMinutes + stay_time <= 600){
            System.out.printf("%s %n", name);
        } else {}
    }
}
