package priv.text.book3.lesson;

/**
 * Created by Enzo Cotter on 2020/12/27.
 */
public class MobileTelephone {
    SIM card;
    public void useSIM(SIM card){
        this.card = card;
    }
     public void  showMess(){
        System.out.println("使用的卡是："+card.giveCorpName());
        System.out.println("手机号码是："+card.giveNumber());
     }
}
