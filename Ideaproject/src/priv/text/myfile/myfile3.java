package priv.text.myfile;

/**
 * Created by Enzo Cotter on 2020/10/15.
 */
public class myfile3 {
    public static void main(String args[]) {
        double sum=0 ;
        double item =1;
        int i=1;
        int n=20;
        do {
            sum = sum + item;
            i+=1;
            item = item*(1.0/i);
        }while(i<=n);
        System.out.println("sum="+sum);
    }

}
