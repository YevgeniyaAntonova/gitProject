package module2.task1;

public class RunnerStudent1 {
    public static void main(String[] args){
        Student1 Tomas = new Student1("Tomas Anderson", 5, 5, 4);
        Student1 Steve = new Student1("Steve White", 3, 3, 4);
        Student1 Anna = new Student1("Anna Smith", 4, 2, 5);
        Student1 Jackson = new Student1("Jackson Turley", 2, 4, 3);
        Student1 Katty = new Student1("Katty Bree", 3, 5, 4);

        Tomas.print(Tomas.name, Tomas.markMath, Tomas.markEnglish, Tomas.markProgramming);
        Steve.print(Steve.name, Steve.markMath, Steve.markEnglish, Steve.markProgramming);
        Anna.print(Anna.name, Anna.markMath, Anna.markEnglish, Anna.markProgramming);
        Jackson.print(Jackson.name, Jackson.markMath, Jackson.markEnglish, Jackson.markProgramming);
        Katty.print(Katty.name, Katty.markMath, Katty.markEnglish, Katty.markProgramming);

    }

}
