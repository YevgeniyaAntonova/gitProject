package module2.Task6.Ex6;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void Greets() {
        System.out.println("Woof");
    }
    public void Greets(Dog another){
        System.out.println("Woooooooof");
    }
}
