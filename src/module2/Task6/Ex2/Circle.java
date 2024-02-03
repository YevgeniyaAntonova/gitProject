package module2.Task6.Ex2;

public class Circle implements GeometricObject{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public String toString(){
        return String.format("Circle[radius=%f]", radius);
    }
    public double getArea(){
        return  Math.PI * Math.pow(radius,2);
    }
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}

