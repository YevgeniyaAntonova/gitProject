package module2.task5;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);   // Construct a Point
        System.out.println(p1);
        p1.setXY(100, 10);
        System.out.println(p1);

        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p3 = new Point(2,6);
        Point p2 = new Point(7,5);
        Line l2 = new Line(p3, p2);
        System.out.println(l2);
    }

}