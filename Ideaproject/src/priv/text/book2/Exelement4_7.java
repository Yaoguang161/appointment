package priv.text.book2;

/**
 * Created by Enzo Cotter on 2020/12/26.
 */
public class Exelement4_7 {
    public static void main(String args[]){
        Battery nanfu=new Battery(100);
        System.out.println("南孚电池的储电量是："+nanfu.elelctricityAmount);
        Radio radio=new Radio();
        System.out.println("收音机开始使用南孚电池");
        radio.openRadio(nanfu);
        System.out.println("目前南孚电池的储电量是："+nanfu.elelctricityAmount);
    }
}
