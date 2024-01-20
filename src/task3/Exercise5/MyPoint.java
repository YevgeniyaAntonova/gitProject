package task3.Exercise5;

public class MyPoint {
    private int x = 0;
    private  int y = 0;

    public  MyPoint(){}
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{this.x,this.y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return String.format("(%d,%d)" , x, y);
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y, 2));
    }
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow(x- another.x,2) + Math.pow(y - another.y,2));
    }
    public double distance(){
        return Math.sqrt(x*x + y*y);
    }

}
