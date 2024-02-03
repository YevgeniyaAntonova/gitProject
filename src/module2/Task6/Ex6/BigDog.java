package module2.Task6.Ex6;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }

    @Override
    public void Greets() {
        System.out.println("Woow");
    }
    public void Greets(Dog another){
        System.out.println("Woooooow");
    }
    public void Greets(BigDog another){
        System.out.println("WooooooooooooooW");
    }
}
