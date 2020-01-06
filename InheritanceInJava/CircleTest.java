package InheritanceInJava;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.toString());
        circle.setRadius(10.0);
        System.out.println(circle.toString());
        circle.setColor("yellow");
        circle.setFilled(false);
        System.out.println(circle.toString());
    }
}
