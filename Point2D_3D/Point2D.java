package Point2D_3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x =x;
        this.y =y;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getX(){
        return x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getY(){
        return y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float [] XY= {getX(),getY()};
        return XY;
    }
    public String toString(){
        return "Toa do XY la: " + "{"+this.getXY()[0] + ", " + this.getXY()[1]+"}";
    }
}
