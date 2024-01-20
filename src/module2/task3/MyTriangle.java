package module2.task3;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return String.format("MyTriangle[v1=(%d,%d),v2=(%d,%d),v3=(%d,%d)]", v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
    }
    public double getPerimeter(){
        return v1.distance(v1.getX(), v1.getY()) + v2.distance(v2.getX(), v2.getY()) + v3.distance(v3.getX(), v3.getY());
    }
    public String getType(){
        String type;
        if(v1.distance(v1.getX(), v1.getY()) == v2.distance(v2.getX(), v2.getY()) && v1.distance(v1.getX(), v1.getY()) == v3.distance(v3.getX(), v3.getY())){
type = "equilateral";
        } else if (v1.distance(v1.getX(), v1.getY()) == v2.distance(v2.getX(), v2.getY()) || v1.distance(v1.getX(), v1.getY()) == v3.distance(v3.getX(), v3.getY()) || v2.distance(v2.getX(), v2.getY()) == v3.distance(v3.getX(), v3.getY())) {
        type = "isosceles";
        }else {
            type = "scalene";
        }
        return type;
        }

}
