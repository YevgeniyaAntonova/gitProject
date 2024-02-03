package module2.Task6.Ex5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle recircle = new ResizableCircle(10);
        recircle.toString();
        recircle.resize(10);
        System.out.println(recircle.radius);
    }
}
