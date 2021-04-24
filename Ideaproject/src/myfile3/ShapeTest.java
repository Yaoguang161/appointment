package myfile3;

/**
 * Created by Enzo Cotter on 2021/3/15.
 */

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle a=new Rectangle();
        a.getA(60.4);
        a.getB(35.1);
        System.out.println(a.getArea());
        System.out.println(a.getPerim());
        Circle b=new Circle();
        b.getR(3);
        System.out.println(b.getArea());
        System.out.println(a.getPerim());
    }

}
