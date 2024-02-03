package module2.Task6.Ex1;

import module2.Task6.Ex1.Rectangle;

public class Square extends Rectangle {
    protected double side;
    public Square(){}
    public Square(double side){
        this.side = side;
    }
    public Square(double side, double width, double length, String color, boolean filled){
        super(width,length,color, filled);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}
