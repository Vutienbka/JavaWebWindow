package Point2D_3D;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
       // System.out.println(point2D.getXY()[0] +" " + point2D.getXY()[1]);
        System.out.println(point2D);
        point2D.setXY(10,20);
        System.out.println(point2D);
    }
}
