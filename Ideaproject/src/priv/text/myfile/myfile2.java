package priv.text.myfile;

/**
 * Created by Enzo Cotter on 2020/10/15.
 */
public class myfile2 {
    public static void main(String args[]) {
        int sum =0;
        int j= 2;
        int i=2;
        for(i=2;i<=100;i++) {
            for( j =2;j<i;j++) {
                if(i%j==0) {
                    break;
                }
            }
            if(j==i) {
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
