package task3.Exercise6;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int x2, int y1, int y2){
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2, y2);
    }
}
