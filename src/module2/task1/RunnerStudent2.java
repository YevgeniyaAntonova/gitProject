package module2.task1;

public class RunnerStudent2 {
    public  static void main(String[] args){
        Student2 Medet = new Student2("Medet", 3.5, 20000);
        Student2 Azamat = new Student2("Azamat", 4.7, 20000);
        Student2 Ali = new Student2("Ali", 1.6, 20000);
        Student2 Togzhan = new Student2("Togzhan", 2.9, 20000);
        Student2 Aidana = new Student2("Aidana", 4.8, 20000);

        Medet.print(Medet.name, Medet.averageMark, Medet.scholarship);
        Azamat.print(Azamat.name, Azamat.averageMark, Azamat.scholarship);
        Ali.print(Ali.name, Ali.averageMark, Ali.scholarship);
        Togzhan.print(Togzhan.name, Togzhan.averageMark, Togzhan.scholarship);
        Aidana.print(Aidana.name, Aidana.averageMark, Aidana.scholarship);

    }
}
