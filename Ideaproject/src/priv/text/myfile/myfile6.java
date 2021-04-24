package priv.text.myfile;

/**
 * Created by Enzo Cotter on 2020/10/15.
 */
public class myfile6 {
    public static void main(String args[]){
        int sum =0;
        for(int i=1;;i++){
            sum = sum+i;
            if(sum>8888){
                System.out.println(i);
                break;
            }
        }
    }
}
