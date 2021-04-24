package priv.text.Example;

/**
 * Created by Enzo Cotter on 2020/10/10.
 */
import java.util.*;
public class Example2_5 {
    public static void main(String args[]) {
        int start = 0,end,middle;
        int a[] = { 12,45,67,89,123,-45,67};
        int N =a.length;
        for(int i =0;i<N;i++){
            for(int j = i+1;i<N;j++){
                if(a[j]<a[i]){
                    int t = a [j];
                   a[j] = a[i];
                   t = a[i];
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入整数，程序将判断是否在数组中：");
                int number = scanner.nextInt();
                int count = 0;
                end  = N;
                middle = (start+end)/2;
                while( number!=a[middle]){
                    if (number > a[middle]) {
                              start = middle;
                    }
                    else{
                        end = middle;
                    }
                    middle = (start+end)/2;
                    count++;
                    if (count > N/2){
                        break;
                    }
                    if(count > N/2){
                        System.out.printf("%d不再数组内。\n",number);
                    }
                    else{
                        System.out.printf("%d在数组内。\n",number);
                    }
                    }
                }
            }
    }
}