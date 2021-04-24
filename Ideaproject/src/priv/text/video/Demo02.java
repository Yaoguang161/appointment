package priv.text.video;

/**
 * Created by Enzo Cotter on 2020/11/25.
 */
public class Demo02 {
    public static void main(String[] args) {
        double max = max(10.0, 20.0);
        System.out.println(max);
    }

    public static double max(double num1, double num2) {
        double result = 0;
        if (num1 == num2) {
            System.out.println("num1=num2");
            return 0;
        }
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}