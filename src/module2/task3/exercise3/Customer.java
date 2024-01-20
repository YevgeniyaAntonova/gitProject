package module2.task3.exercise3;

public class Customer {
    private int id;
    private String  name;
    private Gender gender;
    public Customer(int id, String name, Gender gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", name, id);
    }
}
