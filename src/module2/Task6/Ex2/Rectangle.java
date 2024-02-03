package module2.Task6.Ex2;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public String toString(){
        return String.format("Rectangle[width=%f, length=%f]", width, length);
    }
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
