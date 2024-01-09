package module2.task1;

public class Candidate {
    String name;
    String work;
    int income;
    public Candidate(){}
    public Candidate(String name, String work, int income){
        this.name = name;
        this.work = work;
        this.income = income;
    }
    public  void candidates(String  name, String work, int income) {
        String surname = name.split(" ")[1];
        if (work == "banker") {

        } else if (income <= 1000) {

        } else if (surname.equals("Johnson") || surname.equals("Edisson")) {

        } else {
            System.out.println(name);
        }
    }
}

