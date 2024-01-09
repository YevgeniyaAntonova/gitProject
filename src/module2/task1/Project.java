package module2.task1;

public class Project {
    String name;
    int cost;
    TypeProject type;
    boolean isGovermental;
    public Project(){}
    public Project(String name, int cost, TypeProject type, boolean isGovermental){
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.isGovermental = isGovermental;
    }

    public int costProject(int cost, String specType, TypeProject type, boolean isGovermental){ //стоимость проекта с учетом specType
        int costProject;
        int costProjectfromGov;
        if (isGovermental == true){
            costProject = 0;
        } else if (specType.equals(String.valueOf(type))){
            costProject = (int) (cost - 0.2 * cost);
        } else {
            costProject = cost;
        }
        return costProject;
    }

}

