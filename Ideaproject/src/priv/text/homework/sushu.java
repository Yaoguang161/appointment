package priv.text.homework;

/**
 * Created by Enzo Cotter on 2020/11/1.
 */
public class sushu {
    public static void main(String[] args) {
        int N =1000;
        int j,i;
        for( i =2;i<=N;i++){
            for( j =2;j<=i;j++){
                if(i%j==0){
                  break;
                }
            }
            if(j==i){
                System.out.println(i);
            }
        }
    }
}
