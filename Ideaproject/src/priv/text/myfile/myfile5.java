package priv.text.myfile;

/**
 * Created by Enzo Cotter on 2020/10/15.
 */
public class myfile5 {
    public static void main(String args[]) {
        long sum = 0;
        long f = 8;
        int i;
        for(i=1; i <= 10; i++) {
            sum = sum + f;
            f = f * 10 + f;
        }
        System.out.println(sum); 
    }
}