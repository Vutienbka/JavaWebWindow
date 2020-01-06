package InheritanceInJava;

public class Square extends Rectangle {
    private double side;

    public Square(){

    }
    public Square(double side){
        super(side,side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setColor(String color){
        super.setColor(color);
    }
    public void setFilled(boolean filled){
        super.setFilled(filled);
    }

    public String toString(){
        return "A Square with side= " + this.side + " which is a subclass of " + super.toString();
    }
}
