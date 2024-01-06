package module2.task1;

public class Student1 {
    String name;
    int markMath;
    int markEnglish;
    int markProgramming;
    public Student1(){}
    public Student1(String name, int markMath, int markEnglish, int markProgramming){
         this.name = name;
         this.markMath = markMath;
         this.markEnglish = markEnglish;
         this.markProgramming = markProgramming;
    }
    public void print(String name, int markMath, int markEnglish, int markProgramming){
         double averageMark = (double) (markMath + markEnglish + markProgramming) / 3;
        //System.out.println(averageMark);
         if ( averageMark >= 4){
             System.out.format("%s %f %n", name, averageMark);
         }
    }
}
