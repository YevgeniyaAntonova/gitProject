package module2.task1;

import java.util.Arrays;

public class RunnerPlane {
    public  static void main(String[] args) {
        Plane ABC = new Plane("ABC", "12:05", "12:45");
        ABC.flightDuration(ABC.id, ABC.arrival_time, ABC.leave_time);
        Plane FDR = new Plane("FDR", "12:00",  "12:30");
        FDR.flightDuration(FDR.id, FDR.arrival_time, FDR.leave_time);
        Plane DWE = new Plane("DWE", "15:20",  "18:40");
        FDR.flightDuration(DWE.id, DWE.arrival_time, DWE.leave_time);
        Plane OYH = new Plane("OYH", "12:00",  "12:10");
        FDR.flightDuration(OYH.id, OYH.arrival_time, OYH.leave_time);
        Plane LQW = new Plane("LQW", "15:20", "17:50");
        FDR.flightDuration(LQW.id, LQW.arrival_time, LQW.leave_time);
        Plane BDF = new Plane("BDF",  "12:15",  "15:43");
        FDR.flightDuration(BDF.id, BDF.arrival_time, BDF.leave_time);
        Plane TNE = new Plane("TNE", "15:41",  "16:00");
        FDR.flightDuration(TNE.id, TNE.arrival_time, TNE.leave_time);
    }
}
