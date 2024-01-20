package module2.task3;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(6,4);
        MyCircle circle1 = new MyCircle(2,3,4);
        MyCircle circle2 = new MyCircle(6,4, 7);
        System.out.println(circle1.getArea());
        System.out.println(circle1.distance(circle2));
    }
}
