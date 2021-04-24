package priv.text.myfile;

/**
 * Created by Enzo Cotter on 2020/10/15.
 */

public class myfile1{
    public static void main(String args[]) {
        int sum = 0;
        int N=10;
        int team=1;
        for(int i=1;i<=N;i++) {

            team*=i;
            sum+=team;
        }
        System.out.println("the number=" +sum);

    }

}
