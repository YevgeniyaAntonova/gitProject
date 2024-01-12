package module2.task2;

public class Esper {
    String name;
    int mighty;
    String  type;
    public Esper(){};
    public Esper(String name, int mighty, String  type){
        this.name = name;
        this.mighty = mighty;
        this.type = type;
    }
    public int getMighty(){
        return mighty;
    }
    public String toString(){
        return String.format("%s %d %s ", name, mighty, type);
    }
}
