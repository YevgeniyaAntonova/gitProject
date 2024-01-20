package module2.task3;



public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int x2, int y1, int y2){
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }
    public MyPoint getBegin(){
        return  begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void  setBeginX(int x1){
        this.begin.setX(x1);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y1){
        this.begin.setY(y1);
    }
    public int getEndX(){
        return  end.getX();
    }
    public void  setEndX(int x2){
        end.setX(x2);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y2){
        end.setY(y2);
    }
    public int[] getBeginXY(){
        return new int[] {begin.getX(),begin.getY()};
    }
    public void setBeginXY(int x1, int y1){
        begin.setX(x1);
        begin.setY(y1);
    }
    public int[] getEndXY(){
        return  new int[]{end.getX(), end.getY()};
    }
    public void setEndXY(int x2, int y2){
        end.setX(x2);
        end.setY(y2);
    }
    public double getLength(){
        return  end.distance() - begin.distance();
    }
    public double getGradient(){
        return  Math.atan2(end.getY()-begin.getY(),end.getX()-begin.getX());
    }

    @Override
    public String toString() {
        return String.format("MyLine[begin=(%d,%d), end=(%d,%d)]", begin.getX(),begin.getY(), end.getX(), end.getY());

    }
}
