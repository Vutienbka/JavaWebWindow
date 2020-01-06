package InheritanceInJava;

public class Rectangle extends Shape{
    private double length = 10.0f;
    private double width = 10.2f;

    public Rectangle(){

    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width =  width;
    }

    public Rectangle(double length, double width, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public void setColor(String color){
        super.setColor(color);
    }
    public void setFilled(boolean filled){
        super.setFilled(filled);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
}

    public double getWidth() {
        return this.width;
    }

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }
    public double getArea(){
        return this.width * this.length;
    }
    public String toString(){
        return "A Rectangle with width= " + this.width + " and length= " + this.length + " which is a subclass of " + super.toString();
    }
}
