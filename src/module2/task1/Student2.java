package module2.task1;

public class Student2 {
    String name;
    double averageMark;
    double  scholarship;
    public Student2(){}
    public Student2(String name, double averageMark, double scholarship){
        this.name = name;
        this.averageMark = averageMark;
        this.scholarship = scholarship;
    }
    public void print(String name, double averageMark, double scholarship){
        if (averageMark >= 4.5){
            scholarship += 0.3 * scholarship;
            System.out.format("%s will take %.0f (%.1f)%n", name, scholarship, averageMark);
        } else if (averageMark <= 2){
            return;
        }else {
            scholarship += 0.1 * scholarship;
            System.out.format("%s will take %.0f (%.1f)%n", name, scholarship, averageMark);
        }
    }
}
