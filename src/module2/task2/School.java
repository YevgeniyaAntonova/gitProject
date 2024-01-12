package module2.task2;

import java.util.ArrayList;

public class School {
    String title;
    String spec_type;
    int espCount;
    Esper esper;
    public School(){};
    public School(String title, String  spec_type, int espCount, ArrayList<Esper> espers){
        this.title = title;
        this.spec_type = spec_type;
        this.espCount = espCount;
        this.esper = esper;
    }
    public Esper getEsper(){
        return esper;
    }
    public void setEsper(Esper esper){
        this.esper = esper;
    }
    public void ListSchool(ArrayList<Esper> esper, String spec_type){
        int count = 0;
        int specSchoolCount = 0;
        for (int i =0; i < espCount; i++) {
            if (esper.get(i).mighty <= 10) {

            } else if (esper.get(i).mighty >= 1000) {
                if (spec_type.equals(esper.get(i).type)) {
                    count++;
                } else {
                    specSchoolCount++;
                }
            } else {
                count++;
                specSchoolCount++;
            }
        }
            System.out.printf("%s - %d %n", title, count);
    }
    public String toString(){
        return String.format("%s %s %d", title, spec_type, espCount);
    }

}
