package module2.task1;

import java.util.Arrays;

public class Plane {
    String id;
    String arrival_time;
    String leave_time;
    public Plane(){}
    public Plane(String id, String  leave_time, String arrival_time) {
        this.id = id;
        this.arrival_time = arrival_time;
        this.leave_time = leave_time;
    }
    public void  flightDuration(String id,String arrival_time, String leave_time){
       int h = Integer.parseInt(arrival_time.split(":")[0]) - Integer.parseInt(leave_time.split(":")[0]);
       if (h >= 2){
           System.out.format("%s %s %s%n",id, leave_time, arrival_time);
       }
    }
}
