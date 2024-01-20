package module2.task5;

public class LineSub extends Point{
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    private Point begin;
    private Point end;               // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
    public LineSub (Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    public String toString() {
        return String.format("Begin=(%d,%d), End=(%d,%d)",getBeginX(),getBeginY(),getEndX(),getEndY());
    }

    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(int beginX, int beginY) {
        begin.setXY(beginX,beginY);
    }
    public void setEnd(int endX, int endY) {
        end.setXY(endX,endY);
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
    }       // Length of the line
    public double getGradient() { ... }  // Gradient in radians
}
}
