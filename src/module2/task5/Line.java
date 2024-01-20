package module2.task5;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point

    // Constructors
    public Line (Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);   // construct the Points here
        end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        return String.format("begin=(%d,%d); end=(%d,%d)", getBeginX(), getBeginY(), getEndX(), getEndY());
    }

    public Point getBegin() {
        return new Point(begin.getX(),begin.getY());
    }
    public Point getEnd() {
        return new Point(end.getX(),end.getY());
    }
    public void setBegin(int beginX, int beginY) {
        begin.setXY(beginX,beginY);
    }
    public void setEnd(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        begin.setXY(beginX,beginY);
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        end.setXY(endX,endY);
    }

    public int getLength() {
        return (int)Math.sqrt(Math.pow(end.getX() - begin.getX(),2) + Math.pow(end.getY() - begin.getY(),2));
    } // Length of the line
    //
    public double getGradient() {
        return  Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    } // Gradient in radians
    //
}
