package priv.text.homework;
import javax.swing.*;
import java.util.Scanner;
public class dayu{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入月：");
        int m = s.nextInt();
        System.out.println("请输入日期:");
        int d = s.nextInt();
        int sum = 0;
        int sum1 = 0;
        switch (m - 1)
        {
            case 12:
                sum1 += 31;
            case 11:
                sum1 += 30;
            case 10:
                sum1 += 31;
            case 9:
                sum1 += 30;
            case 8:
                sum1 += 31;
            case 7:
                sum1 += 31;
            case 6:
                sum1 += 30;
            case 5:
                sum1 += 31;
            case 4:
                sum1 += 30;
            case 3:
                sum1 += 31;
            case 2:
                sum1 += 29;//(2020年是闰年)
            case 1:
                sum1 += 31;
        }
        sum1 += d;
        System.out.println (sum1);
        sum = sum1-1;
        if (sum%5==0||sum%5==1||sum%5==2){
            System.out.println(m+"月"+d+"日"+"在打鱼");
        }
        else{
            System.out.println(m+"月"+d+"日"+"在晒网");
        }
    }
}
