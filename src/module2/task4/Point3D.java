package module2.task4;

public class Point3D extends Point2D{
    private float z =0.0f;
    public Point3D(){
        super();
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return String.format("(%f,%f,%f)",getX(), getY(),getZ());
    }
}
