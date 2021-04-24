package myfile3;

/**
 * Created by Enzo Cotter on 2021/3/15.
 */
class Rectangle extends Shape {
    double a, b;
    Rectangle() {
    }
    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double getA(double a) {
        this.a = a;
        return a;
    }
    double getB(double b) {
        this.b = b;
        return b;
    }
    double getArea() {
        return (a * b) / 2;
    }
    double getPerim(){
        return 2*(a+b);
    }
}
