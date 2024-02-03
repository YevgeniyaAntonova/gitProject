package module2.Task6.Ex5;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public String toString(){
        return String.format("Circle[radius=%f]", radius);
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
