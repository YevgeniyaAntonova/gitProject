package module2.Task6.Ex3;

public class MovablePoint implements Movaable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return String.format("(x,y) speed = (%d,%d)", x,y);
    }

    @Override
    public void moveUp() {
        y-= ySpeed;
    }

    @Override
    public void moveDown() {
        y+= ySpeed;
    }

    @Override
    public void moveLeft() {
        x-= xSpeed;
    }

    @Override
    public void moveRigth() {
        x+= xSpeed;
    }
}
