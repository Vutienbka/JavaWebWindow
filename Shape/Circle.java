package Shape;

public class Circle {
    private double radius = 10.0f;
    private String color = "blue";
    //////////////////////
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    ////////////
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    //////////////
    public String toString(){
        return "A Circle with Radius = " + this.getRadius() + " and color is: " + this.getColor();
    }

}