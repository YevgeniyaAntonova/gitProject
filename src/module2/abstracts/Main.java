package module2.abstracts;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Mysyk (1, "Kazy");
        Pet pet2 = new Kushik(2, "Aktos");
        Mysyk mysyk = (Mysyk) pet1;
        Kushik kushik = (Kushik) pet2;
        pet1.voice();
        pet2.voice();
    }
}
