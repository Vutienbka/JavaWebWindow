package Shape;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){

    } // Neu lop Circle khong co constructor rong thi khong the tao duoc lop constructor rong trong Cylinder

    public Cylinder(int radius, int height){
        super(radius); // Su dung lai constructor cua Class Circle
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * this.height;
    }


    public double getVolume(){
        return super.getArea() * this.height;
    }

    public String toString(){
        return "A cylinder has height = " + this. getHeight()+ " and which is subclass of " + super.toString();
    }
}