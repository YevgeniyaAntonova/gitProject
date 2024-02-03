package module2.Task6.Ex4;

public class MovableCircle implements Movaable{
    private int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, ySpeed, ySpeed);
        this.radius = radius;
    }
    public String toString(){
        return String.format("%s, radius=%d",center.toString(),radius);
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y+= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x-= center.xSpeed;
    }

    @Override
    public void moveRigth() {
        center.x+= center.xSpeed;
    }
}
