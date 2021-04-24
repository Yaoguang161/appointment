package priv.text.myfile;

/**
 * Created by Enzo Cotter on 2020/10/13.
 */
public class myfile4 {
    public static void main(String[] args ){
        int N=1000;
        for(int i = 1; i <= N;i++){
            int sum=0; //此时int 定义的位置
            for(int j = 1;j<i;j++){
                 if(i%j==0){
                  sum = sum + j;
                }
            }
            if(i==sum)
            System.out.println("完数有"+i);
        }
    }
}
