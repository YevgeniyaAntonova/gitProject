package module2.Task6.Ex6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        cat.Greets();
        Dog dog = new Dog("Tuzik");
        Dog dog1 = new Dog("Argo");
        dog.Greets();
        dog.Greets(dog1);
        BigDog bigDog = new BigDog("Buran");
        BigDog bigDog1 = new BigDog("Taiga");
        bigDog.Greets();
        bigDog.Greets(dog);
        bigDog.Greets(bigDog1);
    }
}
