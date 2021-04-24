package myfile3;

/**
 * Created by Enzo Cotter on 2021/3/15.
 */
class Circle extends Shape {
    double r;

    Circle() {
    }

    Circle(double r) {
        this.r = r;
    }

    double getR(double r) {
        this.r=r;
        return r;
    }
    double getArea() {
        return r*r*Math.PI;
    }
}
